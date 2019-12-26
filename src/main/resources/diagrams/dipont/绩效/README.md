# 改进1    
- 说明字段的修改，太长显示为`...`
- 主流程明细：员工、成本中心、职能、直属领导 ⚠️填明细这批特殊的考核对象 不应该出现在正常通过LDAP代码查找的组中
- Q1 ～ Q4新增加签任务，考核分数还是以直属领导为准，其他的审核分数作为参考记录
- 新增员工填写季度实际完成量的任务，领导可修改并打分

# 改进2
- 邮件提醒内容修改，pdf修改
- 是否需要根据Q1-Q4选择季度然后直接生成当季度的子流程
- 加签人新增并且删除后会引起空值问题，待解决
- 如果有加签人，任务做好之后返还给原始领导确认，分数以最后原始领导确认的为主
- 总览报表里面加linemanager，和成本中心作为筛选条件

# 改进3
1.学习成长不能删除    
2.评分 分数    
3.加签人需要可以修改实际，领导确认可以改实际    
4.考评结果每个主管打打成绩    
5.报表加分数    
6.mail userID英文名    
7.PDF评分历史

# 4    
 候艳 1920 fiscal year Q3  阶段绩效考核加签完成 endorser finished
Dear,
候艳 1920 fiscal year Q3 阶段绩效考核实际完成情况已填写完成，作为加签人，现在您可以在BPMS中对该员工进行打分。下面是实际完成情况： 
yan.hou the actual completion of the 1920 fiscal year stage Q3 performance appraisal has been completed.Now you can rate this employee in BPMS as an endorser. Here is the actual completion:


加签人已完成对侯艳2019 Q3 的绩效评分 The endorser has completed the grade of 候艳 2019 Q3 performance    

# 5    
“上年度实际”  -->  这里改为上年度同期实际    
