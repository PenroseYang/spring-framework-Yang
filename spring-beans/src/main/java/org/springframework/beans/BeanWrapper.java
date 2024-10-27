/*
 * Copyright 2002-2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.beans;

import java.beans.PropertyDescriptor;

/**
 * Spring低级JavaBeans基础设施的核心接口。
 *
 * <p>通常不会直接使用，而是通过{@link org.springframework.beans.factory.BeanFactory}或
 * {@link org.springframework.validation.DataBinder}隐式使用。
 *
 * <p>提供分析和操作标准JavaBeans的操作：能够获取和设置属性值（单独或批量）、
 * 获取属性描述符，以及查询属性的可读性/可写性。
 *
 * <p>此接口支持<b>嵌套属性</b>，使得能够无限深度地设置子属性的属性值。
 *
 * <p>BeanWrapper的"extractOldValueForEditor"设置的默认值为"false"，
 * 以避免由于调用getter方法而引起的副作用。将其设置为"true"，以将当前属性值暴露给自定义编辑器。
 *
 * @since 2001年4月13日
 */
public interface BeanWrapper extends ConfigurablePropertyAccessor {

	/**
	 * 指定数组和集合自动增长的限制。
	 * <p>在普通的BeanWrapper上，默认是无限制的。
	 *
	 * @since 4.1
	 */
	void setAutoGrowCollectionLimit(int autoGrowCollectionLimit);

	/**
	 * 返回数组和集合自动增长的限制。
	 *
	 * @since 4.1
	 */
	int getAutoGrowCollectionLimit();

	/**
	 * 返回由此对象包装的bean实例。
	 */
	Object getWrappedInstance();

	/**
	 * 返回包装的bean实例的类型。
	 */
	Class<?> getWrappedClass();

	/**
	 * 获取包装对象的PropertyDescriptors（通过标准JavaBeans内省确定）。
	 *
	 * @return 包装对象的PropertyDescriptors
	 */
	PropertyDescriptor[] getPropertyDescriptors();

	/**
	 * 获取包装对象的特定属性的属性描述符。
	 *
	 * @param propertyName 要获取描述符的属性（可能是嵌套路径，但不是索引/映射属性）
	 * @return 指定属性的属性描述符
	 * @throws InvalidPropertyException 如果没有这样的属性
	 */
	PropertyDescriptor getPropertyDescriptor(String propertyName) throws InvalidPropertyException;

}