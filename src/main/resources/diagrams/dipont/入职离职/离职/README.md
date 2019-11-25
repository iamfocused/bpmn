# 离职流程版本说明
- milestone1
    - V1 流程轮廓，少许字段，邮件发送内容为空  
    - V2   
    		- 基本信息由metabase查询填充  
    		- 增加离职类型：员工主动、公司主动、协商  
    		- 挂一个任务，HR可以随时取消离职  
    		- 确认离职，发送邮件给员工，提供《离职计划表》、《离职交接表》下载链接  
    		- 需要一张报表查看流程各个任务节点执行状态 TODO  
    
    

- milestone2   
	- BPMS账号保留时间、剩余年休假、剩余调休小时数、最后雇佣日、财务行政IT对接人   
	- 社保公积金选填  其他那些字段选填   

- 部署过程
	- STEVENT metabase调用，获取个人信息的url
	- COMPELETEVAR metabase调用，查询财务url
	- scripttask2 metabase调用，查询行政、人事的drools url
	- scripttask3 eim接口url
	- DEPARTMAIL 邮件：修改接受人、发送邮箱、url