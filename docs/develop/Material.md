# 如何添加一个新的材料
## 注册材料
### 初始化材料信息
首先，你需要了解本模组的基本的[程序结构](Structure.md)。  
然后，在init下找到RMaterials类，
本模组的材料相关信息都在此处初始化，  
你添加一个类似`public static RMaterial TIN;`的字段，  
再在init方法设定值。
一般你需要设定：
- `setChinese` //材料的关键词
- `setParts` //该材料拥有的部件
- `setColor` //该材料的方块颜色，  
材料并不会自动上色，你仍然需要画材质。
### 开始注册
初始化材料信息后到`ItemRegistry`和`BlockRegistry`注册材料，  
两个类均有`material(RMaterial material)`的注册材料方法，  
直接在`register()`方法注册即可。
## 生成Model,BlockState及Lang
在`datagen`的软件包下找到：
- `LangZHCNProvider` //生成中文语言文件
- `LangENUSProvider` //生成英语语言文件
- `RBlockLootProvider` //生成方块战利品表文件
- `RModelProvider` //生成物品方块model和方块blockstate
### LangXXXXProvider
目前支持生成**简体中文**和**美式英语**的语言文件，  
你只需要在`init()`添加上`add(RMaterial material)`的方法即可。
### RBlockLootProvider
你只需要在`accept()`添加上`lootMaterial(RMaterial material)`的方法即可。
### RModelProvider
你只需要在`generateBlockStateModels()`添加上`genMaterialBlockState(RMaterial material)`的方法，  
在`generateItemModels()`添加上`genMaterialModel(RMaterial material)`即可。
## 添加材质
目前全部部件需要添加一下内容：
- INGOT(PartType.ITEM, "锭"),
- RAW_ORE(PartType.ITEM, "粗%"),
- NUGGET(PartType.ITEM, "粒"),
- BLOCK(PartType.BLOCK, "块"),
- RAW_BLOCK(PartType.BLOCK, "粗%块"),
- ORE(PartType.BLOCK, "矿石"),
- DEEPSLATE_ORE(PartType.BLOCK, "深层%矿石"),
- PLATE(PartType.ITEM, "板"),
- GEAR(PartType.ITEM, "齿轮"),
- DUST(PartType.ITEM, "粉"),
- ROD(PartType.ITEM, "杆");  





