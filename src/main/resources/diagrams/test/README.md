# 当前版本主子表定义规则
> 2019-09-20    

***    

  sample:   

```xml
<activiti:formProperty id="tbzhubiao_item" name="主表" type="string" variable="zhubiao"/>
<activiti:formProperty id="tbzhubiao_param1_字段1_2_string_t1_$$A" name="字段1" type="string" variable="param1"/>
<activiti:formProperty id="tbzhubiao_zibiao_表关联_3_string_join_$$A" name="表关联" type="string" variable="rel"/>
<activiti:formProperty id="tbzhubiao-zibiao_item" name="子表" type="string" variable="zibiao"/>
<activiti:formProperty id="tbzhubiao-zibiao_param2_字段2_2_string_t1_$$A" name="字段2" type="string" variable="param2"/>
<activiti:formProperty id="tbzhubiao-zibiao_join-key_Key_10_string_t1_$$A" name="Key" type="string"/>
```

 * 一级表头:id = tb**X**\_item   ①
 * 关联变量:id = tb**X**\_**XX**\_rel\_1\_string\_join\_$$A   ②   
 * 二级表头:id = tb**X**-**XX**\_item   ③
 * 二级表单:id = tb**X**-**XX**\_字段\_pram\_1\_string\_t1\_$$A   ④
 * 关联Key:id = tb**X**-**XX**\_join-key\_Key\_10\_string\_t1\_$$A   ⑤    
 
 ①中主表的std:[{"rel":"1568960416061,1568960416062,1568960416063"}]    
 ③中子表的std:[{"param":"1","key":"1568960416061"},{"param":"2","key":"1568960416062"},{"param":"3","key":"1568960416063"}]
 
