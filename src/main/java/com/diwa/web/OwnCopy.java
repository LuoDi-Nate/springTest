package com.diwa.web;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.util.Assert;

import com.diwa.model.TModelA;
import com.diwa.model.TModelB;

public class OwnCopy {

	public static void ownCopy(Object source, Object target) throws Exception {
		Assert.notNull(source, "Source must not be null");
		Assert.notNull(target, "Target must not be null");

		Class sourceClass = source.getClass();
		Class targetClass = target.getClass();
		Field[] sourceField = sourceClass.getDeclaredFields();
		Field[] targetField = targetClass.getDeclaredFields();
		Map<String, String> sourceStandardMap = new HashMap<String, String>();
		Map<String, String> targetStandardMap = new HashMap<String, String>();

		for (Field f : sourceField) {
			f.setAccessible(true);
			String sourceFiledNameString = f.getName();
			// 除掉下划线
			String lowString = sourceFiledNameString.replace("_", "");
			// 转化成小写
			lowString = lowString.toLowerCase();
			// key:处理后的字段名 value:处理前的字段名
			sourceStandardMap.put(sourceFiledNameString, lowString);
		}

		for (Field f : targetField) {
			f.setAccessible(true);
			String targetFiledNameString = f.getName();
			// 除掉下划线
			String lowString = targetFiledNameString.replace("_", "");
			// 转化成小写
			lowString = lowString.toLowerCase();
			// key:处理后的字段名 value:处理前的字段名
			targetStandardMap.put(targetFiledNameString, lowString);
		}

		// 准备工作完成 开始重头戏
		for (Field field : sourceField) {
			String sourceName = field.getName(); // 属性名
			String sourceStandardName = sourceStandardMap.get(sourceName);
			Class tpye = field.getType(); // 属性类型

			String methodName = sourceName.substring(0, 1).toUpperCase()
					+ sourceName.substring(1);
			Method getMethod = sourceClass.getMethod("get" + methodName); // 拿到set方法 如果get方法不是标准驼峰  自己玩去吧

			Object value = getMethod.invoke(source); // 执行source的get 拿到value

			for (Field f : targetField) {
				String targetName = f.getName(); // 目标的属性名
				String setTargetName = targetName.substring(0, 1).toUpperCase()
						+ targetName.substring(1);
				String targetStandardName = targetStandardMap.get(targetName);
				// 如果有重名,直接set
				if (sourceStandardName.equals(targetStandardName)) {
					Method setMethod = targetClass.getMethod("set"
							+ setTargetName, tpye); // 目标属性的set方法

					setMethod.invoke(target, value);// 写入
				}

			}
		}
	}

	public static void main(String[] args) throws Exception {
		TModelA t1 = new TModelA();
		t1.setNameString("test");
		t1.setWorkCode(1212);
		t1.setCreateSinceDate(new Date());
		TModelB t2 = new TModelB();
		ownCopy(t1, t2);
		System.out.println(t2);
	}

}
