# 如何添加一个新的材料部件
非常简单在`RMaterialPart`添加一个新的枚举项目就行。
```java
public enum RMaterialPart {
    TEST(PartType.ITEM, "测试部件");
    RMaterialPart(PartType type, String chinese) {
        //参数type为部件类型
        //参数chinese为部件的中文关键词语，将会用于生成中文语言文件
        //...
    }
    
    public enum PartType {
        BLOCK,
        ITEM
    }
}
```
`String chinese`的文本可以用%替换插入材料中文关键词的位置，  
例如: "测试用%钉子" -> 生成"测试用铁钉子"   
然后就没有其他操作内容了。