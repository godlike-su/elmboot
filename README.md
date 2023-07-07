数据库默认建立了1个管理员，也就是管理用户。普通用户自己注册就好
账号：12345678900   密码：123456


医生用户：
账号：123456   密码：123456


后端代码：
使用的是jdk17， mysql 5.7

创建数据库的文件在elmboot代码的resources目录下

application.yml文件需要将数据库 账号和密码改成自己的。
文件上传路径也在yml文件中，有注释，可以改成自己的路径或者不改
端口是 8088，建议不改，改了vue文件的也要改。有点麻烦
swagger的路径，可以查看所有的接口:   http://localhost:8088/swagger-ui.html

前端vue：
使用的是vue3，安装的略过
头次运行需要下载依赖，再vue目录下执行
npm install
运行代码：npm run serve

elmboot-vue3 是用户登录的界面端口是8080   http://localhost:8080

elmboot-doctor 是医生登录的界面 端口是8081  http://localhost:8081


