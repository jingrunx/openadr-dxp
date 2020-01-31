package cn.openadr.domain;

import cn.openadr.jackson.EnumeratedDeserializer;

public enum EndDeviceAssetType implements EnumeratedType {
	/**
	 * 恒温器
	 */
	Thermostat,
	/**
	 * 带加热器
	 */
	Strip_Heater,
	/**
	 * 护壁板加热器
	 */
	Baseboard_Heater,
	/**
	 * 热水器
	 */
	Water_Heater,
	/**
	 * 泵池
	 */
	Pool_Pump,
	/**
	 * 桑拿
	 */
	Sauna,
	/**
	 * 热水浴缸
	 */
	Hot_tub,
	/**
	 * 智能家电
	 */
	Smart_Appliance,
	/**
	 * 灌溉泵
	 */
	Irrigation_Pump,
	/**
	 * 工商业负荷
	 */
	Managed_Commercial_and_Industrial_Loads,
	/**
	 * 简易住宅
	 */
	Simple_Residential_On_Off_Loads,
	/**
	 * 外部照明
	 */
	Exterior_Lighting,
	/**
	 * 室内照明
	 */
	Interior_Lighting,
	/**
	 * 电动汽车
	 */
	Electric_Vehicle,
	/**
	 * 发电系统
	 */
	Generation_Systems,
	/**
	 * 负荷控制开关
	 */
	Load_Control_Switch,
	/**
	 * 智能变频
	 */
	Smart_Inverter,
	/**
	 * 充电桩 Electric Vehicle Supply Equipment
	 */
	EVSE,
	/**
	 * 储能装置 Electrochemical energy storage unit
	 */
	RESU,
	/**
	 * 能量管理系统
	 */
	Energy_Management_System,
	/**
	 * 智能能源模块
	 */
	Smart_Energy_Module,
	/**
	 * 存储
	 */
	Storage,
	//x-{user defined}
	;

	@Override
	public String value() {
		return name();
	}

	public static class Deserializer extends EnumeratedDeserializer<EndDeviceAssetType> {
		public Deserializer() {
			super(EndDeviceAssetType.class);
		}
	}
}
