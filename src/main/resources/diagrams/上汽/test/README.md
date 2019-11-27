# 临港SMPV索赔流程    

- 目标：将每条索赔明细划分责任
- 实现：设启动流程导入的每条明细在A Collection，已划分责任的明细在B Collection
	在流程运转期间，会不断从A中拿出item到B中，结束时，A中应为空