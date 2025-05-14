# 三消小游戏

## 项目简介
本项目是一个基于 Java 和 JavaFX 实现的桌面三消小游戏。玩家可以通过交换相邻方块，使三个或以上相同颜色的方块连成一线进行消除，体验经典的消除乐趣。

## 主要特性
- 8x8 游戏网格，五种不同颜色方块
- 随机生成初始棋盘
- 可扩展消除、计分、关卡等功能

## 开发环境
- JDK 17 或以上（推荐 JDK 17）
- Maven 3.6+（推荐 3.8 及以上）
- JavaFX 17 由 Maven 自动管理
- 推荐使用 Cursor、VSCode 或 IntelliJ IDEA 作为开发工具

## 依赖说明
- JavaFX 控件与 FXML 依赖已在 `pom.xml` 中配置，无需手动下载

## 运行方法

### 1. 使用 Maven 命令运行（推荐）
在项目根目录下打开终端，输入：
```sh
mvn clean javafx:run
```
首次运行会自动下载依赖，稍等片刻即可弹出游戏窗口。

### 2. 使用 IDE 运行
- 用 IDEA/VSCode/Cursor 打开项目
- 右键 `Main.java`，选择"运行"或点击 main 方法左侧绿色三角按钮

## 目录结构
```
├── pom.xml           # Maven 配置文件
├── README.md         # 项目说明
└── src
    └── main
        └── java
            └── com
                └── sanxiao
                    ├── Main.java
                    ├── GameBoard.java
                    └── Block.java
```

## 常见问题
1. **缺少 JavaFX 运行时组件**
   - 请务必用 `mvn javafx:run` 启动，或在 IDE 配置好 JavaFX 依赖
2. **mvn 不是内部命令**
   - 请检查 Maven 是否安装并配置到环境变量
3. **JDK 版本不兼容**
   - 推荐使用 JDK 17，JDK 11 及以上需手动配置 JavaFX

## 交流与反馈
如有问题或建议，欢迎提 issue 或联系开发者。 