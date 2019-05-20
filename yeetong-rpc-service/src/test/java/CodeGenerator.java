
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.Context;
import org.mybatis.generator.config.JDBCConnectionConfiguration;
import org.mybatis.generator.config.JavaClientGeneratorConfiguration;
import org.mybatis.generator.config.JavaModelGeneratorConfiguration;
import org.mybatis.generator.config.ModelType;
import org.mybatis.generator.config.PluginConfiguration;
import org.mybatis.generator.config.PropertyRegistry;
import org.mybatis.generator.config.SqlMapGeneratorConfiguration;
import org.mybatis.generator.config.TableConfiguration;
import org.mybatis.generator.internal.DefaultShellCallback;
import org.yeetong.rpc.service.core.ProjectConstant;

import com.google.common.base.CaseFormat;

import freemarker.template.TemplateExceptionHandler;

/**
 * 代码生成器，根据数据表名称生成对应的Model、Mapper、Service、Controller简化开发。
 */
public class CodeGenerator {
	// JDBC配置，请修改为你项目的实际配置
	// private static final String JDBC_URL =
	// "jdbc:mysql://localhost:3306/yeetong_db?useSSL=false";
	private static final String JDBC_URL = "jdbc:mysql://localhost:3306/yeetong_zhny?useSSL=false";
	private static final String JDBC_USERNAME = "root";
	private static final String JDBC_PASSWORD = "123456";
	private static final String JDBC_DIVER_CLASS_NAME = "com.mysql.jdbc.Driver";

	private static final String PROJECT_PATH = System.getProperty("user.dir");// 项目在硬盘上的基础路径
	private static final String TEMPLATE_FILE_PATH = PROJECT_PATH + "/src/test/resources/generator/template";// 模板位置

	private static final String JAVA_PATH = "/src/main/java"; // java文件路径
	private static final String RESOURCES_PATH = "/src/main/resources";// 资源文件路径

	private static final String PACKAGE_PATH_SERVICE = packageConvertPath(ProjectConstant.SERVICE_PACKAGE);// 生成的Service存放路径
	private static final String PACKAGE_PATH_SERVICE_IMPL = packageConvertPath(ProjectConstant.SERVICE_IMPL_PACKAGE);// 生成的Service实现存放路径
	// private static final String PACKAGE_PATH_CONTROLLER =
	// packageConvertPath(ProjectConstant.CONTROLLER_PACKAGE);// 生成的Controller存放路径

	private static final String AUTHOR = "SiZhongXia";// @author
	private static final String DATE = new SimpleDateFormat("yyyy/MM/dd").format(new Date());// @date

	public static void main(String[] args) {
		// TODO计划
//		genCodeByCustomModelName("td_plan", "TdPlan", "todo");
//		genCodeByCustomModelName("td_token", "TdToken", "todo");
//		genCodeByCustomModelName("td_user", "TdUser", "todo");
//		genCodeByCustomModelName("td_user_like", "TdUserLike", "todo");
//		genCodeByCustomModelName("td_user_wx", "TdUserWx", "todo");
		
		
		// 智慧农场
		genCodeByCustomModelName("smart_culture_alarm_conf", "SmartCultureAlarmConf", "zn");
		genCodeByCustomModelName("smart_culture_alarm_push_record", "SmartCultureAlarmPushRecord", "zn");
		genCodeByCustomModelName("smart_culture_basic_city", "SmartCultureBasicCity", "zn");
		genCodeByCustomModelName("smart_culture_client_activation", "SmartCultureClientActivation", "zn");
		genCodeByCustomModelName("smart_culture_equipment", "SmartCultureEquipment", "zn");
		genCodeByCustomModelName("smart_culture_equipment_model", "SmartCultureEquipmentModel", "zn");
		genCodeByCustomModelName("smart_culture_equipment_outline_receive", "SmartCultureEquipmentOutlineReceive", "zn");
		genCodeByCustomModelName("smart_culture_equipment_outline_res", "SmartCultureEquipmentOutlineRes", "zn");
		genCodeByCustomModelName("smart_culture_equipment_type", "SmartCultureEquipmentType", "zn");
		genCodeByCustomModelName("smart_culture_farm", "SmartCultureFarm", "zn");
		genCodeByCustomModelName("smart_culture_farm_area", "SmartCultureFarmArea", "zn");
		genCodeByCustomModelName("smart_culture_farm_func", "SmartCultureFarmFunc", "zn");
		genCodeByCustomModelName("smart_culture_farm_map_area", "SmartCultureFarmMapArea", "zn");
		genCodeByCustomModelName("smart_culture_farm_map_area_style", "SmartCultureFarmMapAreaStyle", "zn");
		genCodeByCustomModelName("smart_culture_farm_pic", "SmartCultureFarmPic", "zn");
		genCodeByCustomModelName("smart_culture_farm_raise_apply", "SmartCultureFarmRaiseApply", "zn");
		genCodeByCustomModelName("smart_culture_feed", "SmartCultureFeed", "zn");
		// 智慧农场
//		genCodeByCustomModelName("smart_culture_feed_pic", "SmartCulture_feed_pic", "zn");
//		genCodeByCustomModelName("smart_culture_feed_tag", "SmartCulture_feed_tag", "zn");
//		genCodeByCustomModelName("smart_culture_hls_control", "SmartCulture_hls_control", "zn");
//		genCodeByCustomModelName("smart_culture_hls_control_his", "SmartCulture_hls_control_his", "zn");
//		genCodeByCustomModelName("smart_culture_hls_status", "SmartCulture_hls_status", "zn");
//		genCodeByCustomModelName("smart_culture_hly_current", "SmartCulture_hly_current", "zn");
//		genCodeByCustomModelName("smart_culture_hly_his", "SmartCulture_hly_his", "zn");
//		genCodeByCustomModelName("smart_culture_inspection", "SmartCulture_inspection", "zn");
//		genCodeByCustomModelName("smart_culture_inspection_pic", "SmartCulture_inspection_pic", "zn");
//		genCodeByCustomModelName("smart_culture_inspection_point", "SmartCulture_inspection_point", "zn");
//		genCodeByCustomModelName("smart_culture_inspection_point_check_item", "SmartCulture_inspection_point_check_item", "zn");
//		genCodeByCustomModelName("smart_culture_inspection_res", "SmartCulture_inspection_res", "zn");
//		genCodeByCustomModelName("smart_culture_layeggs", "SmartCulture_layeggs", "zn");
//		genCodeByCustomModelName("smart_culture_layeggs_pic", "SmartCulture_layeggs_pic", "zn");
//		genCodeByCustomModelName("smart_culture_menu", "SmartCulture_menu", "zn");
//		genCodeByCustomModelName("smart_culture_message_centre", "SmartCulture_message_centre", "zn");
//		genCodeByCustomModelName("smart_culture_moa_ap_type", "SmartCulture_moa_ap_type", "zn");
//		genCodeByCustomModelName("smart_culture_moa_wpap_200dzs", "SmartCulture_moa_wpap_200dzs", "zn");
//		genCodeByCustomModelName("smart_culture_moa_wpap_200mzs", "SmartCulture_moa_wpap_200mzs", "zn");
//		genCodeByCustomModelName("smart_culture_moa_wpap_month", "SmartCulture_moa_wpap_month", "zn");
//		genCodeByCustomModelName("smart_culture_moa_wpap_week", "SmartCulture_moa_wpap_week", "zn");
//		genCodeByCustomModelName("smart_culture_monitor_term", "SmartCulture_monitor_term", "zn");
//		genCodeByCustomModelName("smart_culture_organize", "SmartCulture_organize", "zn");
//		genCodeByCustomModelName("smart_culture_poultry", "SmartCulture_poultry", "zn");
//		genCodeByCustomModelName("smart_culture_poultry_res", "SmartCulture_poultry_res", "zn");
//		genCodeByCustomModelName("smart_culture_poultry_type", "SmartCulture_poultry_type", "zn");
//		genCodeByCustomModelName("smart_culture_poultry_vaccination", "SmartCulture_poultry_vaccination", "zn");
//		genCodeByCustomModelName("smart_culture_poultry_variety", "SmartCulture_poultry_variety", "zn");
//		genCodeByCustomModelName("smart_culture_single_sensor_current", "SmartCulture_single_sensor_current", "zn");
//		genCodeByCustomModelName("smart_culture_single_sensor_his", "SmartCulture_single_sensor_his", "zn");
//		genCodeByCustomModelName("smart_culture_sms", "SmartCulture_sms", "zn");
//		genCodeByCustomModelName("smart_culture_system_dict", "SmartCulture_system_dict", "zn");
//		genCodeByCustomModelName("smart_culture_system_dict_val", "SmartCulture_system_dict_val", "zn");
//		genCodeByCustomModelName("smart_culture_system_func", "SmartCulture_system_func", "zn");
//		genCodeByCustomModelName("smart_culture_system_func_description", "SmartCulture_system_func_description", "zn");
//		genCodeByCustomModelName("smart_culture_system_func_platform", "SmartCulture_system_func_platform", "zn");
//		genCodeByCustomModelName("smart_culture_system_func_platform_pic", "SmartCulture_system_func_platform_pic", "zn");
//		genCodeByCustomModelName("smart_culture_system_message", "SmartCulture_system_message", "zn");
//		genCodeByCustomModelName("smart_culture_system_message_push_record", "SmartCulture_system_message_push_record", "zn");
//		genCodeByCustomModelName("smart_culture_system_order", "SmartCulture_system_order", "zn");
//		genCodeByCustomModelName("smart_culture_user", "SmartCulture_user", "zn");
//		genCodeByCustomModelName("smart_culture_user_farm", "SmartCulture_user_farm", "zn");
//		genCodeByCustomModelName("smart_culture_user_identity", "SmartCulture_user_identity", "zn");
//		genCodeByCustomModelName("smart_culture_user_member_score", "SmartCulture_user_member_score", "zn");
//		genCodeByCustomModelName("smart_culture_user_member_score_res", "SmartCulture_user_member_score_res", "zn");
//		genCodeByCustomModelName("smart_culture_user_menu", "SmartCulture_user_menu", "zn");
//		genCodeByCustomModelName("smart_culture_user_mp_dailypush_res", "SmartCulture_user_mp_dailypush_res", "zn");
//		genCodeByCustomModelName("smart_culture_user_mp_template_scene", "SmartCulture_user_mp_template_scene", "zn");
//		genCodeByCustomModelName("smart_culture_user_signin_res", "SmartCulture_user_signin_res", "zn");
//		genCodeByCustomModelName("smart_culture_user_token", "SmartCulture_user_token", "zn");
//		genCodeByCustomModelName("smart_culture_user_signin_res", "SmartCulture_user_signin_res", "zn");
//		genCodeByCustomModelName("smart_culture_user_weixin", "SmartCulture_user_weixin", "zn");
//		genCodeByCustomModelName("smart_culture_user_weixin_scan", "SmartCulture_user_weixin_scan", "zn");
//		genCodeByCustomModelName("smart_culture_video", "SmartCulture_video", "zn");
//		genCodeByCustomModelName("smart_culture_weather_city", "SmartCulture_weather_city", "zn");
//		genCodeByCustomModelName("smart_culture_weather_history", "SmartCulture_weather_history", "zn");
//		genCodeByCustomModelName("smart_culture_weather_now", "SmartCulture_weather_now", "zn");
//		genCodeByCustomModelName("smart_culture_weather_sunrise", "SmartCulture_weather_sunrise", "zn");
		
	}

	/**
	 * 通过数据表名称生成代码，Model 名称通过解析数据表名称获得，下划线转大驼峰的形式。 如输入表名称 "t_user_detail" 将生成
	 * TUserDetail、TUserDetailMapper、TUserDetailService ...
	 * 
	 * @param tableNames
	 *            数据表名称...
	 */
	// public static void genCode(String... tableNames) {
	// for (String tableName : tableNames) {
	// genCodeByCustomModelName(tableName, "");
	// }
	// }

	/**
	 * 通过数据表名称，和自定义的 Model 名称生成代码 如输入表名称 "t_user_detail" 和自定义的 Model 名称 "User" 将生成
	 * User、UserMapper、UserService ...
	 * 
	 * @param tableName
	 *            数据表名称
	 * @param modelName
	 *            自定义的 Model 名称
	 */
	public static void genCodeByCustomModelName(String tableName, String modelName, String db) {
		genModelAndMapper(tableName, modelName, db);
		genService(tableName, modelName, db);
		// genController(tableName, modelName);
	}

	public static void genModelAndMapper(String tableName, String modelName, String db) {
		Context context = new Context(ModelType.FLAT);
		context.setId("Potato");
		context.setTargetRuntime("MyBatis3Simple");
		context.addProperty(PropertyRegistry.CONTEXT_BEGINNING_DELIMITER, "`");
		context.addProperty(PropertyRegistry.CONTEXT_ENDING_DELIMITER, "`");

		JDBCConnectionConfiguration jdbcConnectionConfiguration = new JDBCConnectionConfiguration();
		jdbcConnectionConfiguration.setConnectionURL(JDBC_URL);
		jdbcConnectionConfiguration.setUserId(JDBC_USERNAME);
		jdbcConnectionConfiguration.setPassword(JDBC_PASSWORD);
		jdbcConnectionConfiguration.setDriverClass(JDBC_DIVER_CLASS_NAME);
		context.setJdbcConnectionConfiguration(jdbcConnectionConfiguration);

		PluginConfiguration pluginConfiguration = new PluginConfiguration();
		pluginConfiguration.setConfigurationType("tk.mybatis.mapper.generator.MapperPlugin");
		pluginConfiguration.addProperty("mappers", ProjectConstant.MAPPER_INTERFACE_REFERENCE);
		context.addPluginConfiguration(pluginConfiguration);

		JavaModelGeneratorConfiguration javaModelGeneratorConfiguration = new JavaModelGeneratorConfiguration();
		javaModelGeneratorConfiguration.setTargetProject(PROJECT_PATH + JAVA_PATH);
		javaModelGeneratorConfiguration.setTargetPackage(ProjectConstant.MODEL_PACKAGE);
		context.setJavaModelGeneratorConfiguration(javaModelGeneratorConfiguration);

		SqlMapGeneratorConfiguration sqlMapGeneratorConfiguration = new SqlMapGeneratorConfiguration();
		sqlMapGeneratorConfiguration.setTargetProject(PROJECT_PATH + RESOURCES_PATH);
		sqlMapGeneratorConfiguration.setTargetPackage("mapper");
		context.setSqlMapGeneratorConfiguration(sqlMapGeneratorConfiguration);

		JavaClientGeneratorConfiguration javaClientGeneratorConfiguration = new JavaClientGeneratorConfiguration();
		javaClientGeneratorConfiguration.setTargetProject(PROJECT_PATH + JAVA_PATH);
		javaClientGeneratorConfiguration.setTargetPackage(ProjectConstant.MAPPER_PACKAGE + "." + db);
		javaClientGeneratorConfiguration.setConfigurationType("XMLMAPPER");
		context.setJavaClientGeneratorConfiguration(javaClientGeneratorConfiguration);

		TableConfiguration tableConfiguration = new TableConfiguration(context);
		tableConfiguration.setTableName(tableName);
		if (StringUtils.isNotEmpty(modelName))
			tableConfiguration.setDomainObjectName(modelName);
		// tableConfiguration.setGeneratedKey(new GeneratedKey("id", "Mysql",
		// true, null));
		context.addTableConfiguration(tableConfiguration);

		List<String> warnings;
		MyBatisGenerator generator;
		try {
			Configuration config = new Configuration();
			config.addContext(context);
			config.validate();

			boolean overwrite = true;
			DefaultShellCallback callback = new DefaultShellCallback(overwrite);
			warnings = new ArrayList<String>();
			generator = new MyBatisGenerator(config, callback, warnings);
			generator.generate(null);
		} catch (Exception e) {
			throw new RuntimeException("生成Model和Mapper失败", e);
		}

		if (generator.getGeneratedJavaFiles().isEmpty() || generator.getGeneratedXmlFiles().isEmpty()) {
			throw new RuntimeException("生成Model和Mapper失败：" + warnings);
		}
		if (StringUtils.isEmpty(modelName))
			modelName = tableNameConvertUpperCamel(tableName);
		System.out.println(modelName + ".java 生成成功");
		System.out.println(modelName + "Mapper.java 生成成功");
		System.out.println(modelName + "Mapper.xml 生成成功");
	}

	public static void genService(String tableName, String modelName, String db) {
		try {
			freemarker.template.Configuration cfg = getConfiguration();

			Map<String, Object> data = new HashMap<>();
			data.put("date", DATE);
			data.put("author", AUTHOR);
			String modelNameUpperCamel = StringUtils.isEmpty(modelName) ? tableNameConvertUpperCamel(tableName) : modelName;
			data.put("modelNameUpperCamel", modelNameUpperCamel);
			data.put("db", db);
			data.put("modelNameLowerCamel", tableNameConvertLowerCamel(tableName));
			data.put("basePackage", ProjectConstant.BASE_PACKAGE);

			File file = new File(PROJECT_PATH + JAVA_PATH + PACKAGE_PATH_SERVICE + modelNameUpperCamel + "Service.java");
			if (!file.getParentFile().exists()) {
				file.getParentFile().mkdirs();
			}
			cfg.getTemplate("service.ftl").process(data, new FileWriter(file));
			System.out.println(modelNameUpperCamel + "Service.java 生成成功");

			File file1 = new File(PROJECT_PATH + JAVA_PATH + PACKAGE_PATH_SERVICE_IMPL + modelNameUpperCamel + "ServiceImpl.java");
			if (!file1.getParentFile().exists()) {
				file1.getParentFile().mkdirs();
			}
			cfg.getTemplate("service-impl.ftl").process(data, new FileWriter(file1));
			System.out.println(modelNameUpperCamel + "ServiceImpl.java 生成成功");
		} catch (Exception e) {
			throw new RuntimeException("生成Service失败", e);
		}
	}

	// private static void genController(String tableName, String modelName) {
	// try {
	// freemarker.template.Configuration cfg = getConfiguration();
	//
	// Map<String, Object> data = new HashMap<>();
	// data.put("date", DATE);
	// data.put("author", AUTHOR);
	// String modelNameUpperCamel = StringUtils.isEmpty(modelName) ?
	// tableNameConvertUpperCamel(tableName) : modelName;
	// data.put("baseRequestMapping",
	// modelNameConvertMappingPath(modelNameUpperCamel));
	// data.put("modelNameUpperCamel", modelNameUpperCamel);
	// data.put("modelNameLowerCamel",
	// CaseFormat.UPPER_CAMEL.to(CaseFormat.LOWER_CAMEL, modelNameUpperCamel));
	// data.put("basePackage", ProjectConstant.BASE_PACKAGE);
	//
	// File file = new File(PROJECT_PATH + JAVA_PATH + PACKAGE_PATH_CONTROLLER +
	// modelNameUpperCamel + "Controller.java");
	// if (!file.getParentFile().exists()) {
	// file.getParentFile().mkdirs();
	// }
	// cfg.getTemplate("controller.ftl").process(data, new FileWriter(file));
	// System.out.println(modelNameUpperCamel + "Controller.java 生成成功");
	// } catch (Exception e) {
	// throw new RuntimeException("生成Controller失败", e);
	// }
	//
	// }

	private static freemarker.template.Configuration getConfiguration() throws IOException {
		freemarker.template.Configuration cfg = new freemarker.template.Configuration(freemarker.template.Configuration.VERSION_2_3_23);
		cfg.setDirectoryForTemplateLoading(new File(TEMPLATE_FILE_PATH));
		cfg.setDefaultEncoding("UTF-8");
		cfg.setTemplateExceptionHandler(TemplateExceptionHandler.IGNORE_HANDLER);
		return cfg;
	}

	private static String tableNameConvertLowerCamel(String tableName) {
		return CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, tableName.toLowerCase());
	}

	private static String tableNameConvertUpperCamel(String tableName) {
		return CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.UPPER_CAMEL, tableName.toLowerCase());

	}

	// private static String tableNameConvertMappingPath(String tableName) {
	// tableName = tableName.toLowerCase();// 兼容使用大写的表名
	// return "/" + (tableName.contains("_") ? tableName.replaceAll("_", "/") :
	// tableName);
	// }

	// private static String modelNameConvertMappingPath(String modelName) {
	// String tableName = CaseFormat.UPPER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE,
	// modelName);
	// return tableNameConvertMappingPath(tableName);
	// }

	private static String packageConvertPath(String packageName) {
		return String.format("/%s/", packageName.contains(".") ? packageName.replaceAll("\\.", "/") : packageName);
	}

}
