
create database elmboot;
use elmboot;

CREATE TABLE hospital (
  hpld INT AUTO_INCREMENT PRIMARY KEY COMMENT '医院编号',
  name VARCHAR(30) NOT NULL COMMENT '医院名称',
  picture MEDIUMTEXT NOT NULL COMMENT '医院图片',
  telephone VARCHAR(20) NOT NULL COMMENT '医院电话',
  address VARCHAR(100) NOT NULL COMMENT '医院地址',
  businessHours VARCHAR(100) NOT NULL COMMENT '营业时间',
  deadline VARCHAR(30) NOT NULL COMMENT '采血截止时间',
  rule VARCHAR(30) NOT NULL COMMENT '预约人数规则',
  state INT NOT NULL COMMENT '医院状态(1: 正常; 2: 其他)'
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='医院信息表';


CREATE TABLE setmeal (
  smId INT AUTO_INCREMENT PRIMARY KEY COMMENT '体检套餐编号',
  name VARCHAR(255) NOT NULL COMMENT '体检套餐名称',
  type int NOT NULL COMMENT '体检套类型(1: 男士套; 0: 女餐 )',
  price INT NOT NULL COMMENT '体检套餐价格'
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='体检套餐信息表';



CREATE TABLE setmealdetailed (
  sdId INT AUTO_INCREMENT PRIMARY KEY COMMENT '体检套餐项目明细缩号(无意义主键 )',
  smId INT  NOT NULL   COMMENT '体检套编号',
  cild  INT  NOT NULL  COMMENT '体检检查项编号'
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='体检套餐项目明细表';


CREATE TABLE checkitem (
  cild INT AUTO_INCREMENT PRIMARY KEY COMMENT '检查项编号',
  ciName VARCHAR(30)  NOT NULL   COMMENT '检查项名称',
  ciContent VARCHAR(200) NOT NULL COMMENT '检查项内容',
  meaning VARCHAR(200)  COMMENT '检查项意义  ',
  remarks VARCHAR(50)  COMMENT '备注'
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='检查项信息表';



CREATE TABLE checkitemdetailed (
  cdId INT AUTO_INCREMENT PRIMARY KEY COMMENT '检查项明细编号',
  ciName VARCHAR(40)  NOT NULL   COMMENT '检查项明细名称',
  unit VARCHAR(20)  COMMENT '检查项明细单位',
  minrange double COMMENT '检查项明细正常值范围中的最小值  ',
  maxrange double  COMMENT '检查项明细正常值范围中的最大值  ',
  normalValue VARCHAR(20)  COMMENT '检查项明细正常值(非数字型 )  ',
  normalValueString VARCHAR(20)  COMMENT '检查项验证范围说明文字  ',
  type int NOT NULL COMMENT '检查项明细类型(1:数值范围验证型，2:数值相等验证型 :3: 无需验证型:4: 描述型:5:其它)  ',
  cild int NOT NULL  COMMENT '所属检查项编号  ',
  remarks VARCHAR(100)  COMMENT '备注'
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='检查项明细表';


CREATE TABLE orders (
  orderId INT AUTO_INCREMENT PRIMARY KEY  COMMENT '订单编号',
  orderDate date  NOT NULL   COMMENT '预约日期',
  userId VARCHAR(11) NOT NULL COMMENT '客户编号',
  hpld INT NOT NULL COMMENT '所属医院编号  ',
  smId INT NOT NULL COMMENT '所属套餐编号  ',
  state INT NOT NULL COMMENT '订单状态(1: 末归档 ; 2 : 已归档 ) '
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='体检预约订单表';




CREATE TABLE oberallresult (
  orld INT AUTO_INCREMENT PRIMARY KEY COMMENT '总检结论项编号',
  title VARCHAR(4)  NOT NULL   COMMENT '总检结论项标题',
  content VARCHAR(400)  COMMENT '总检结论项内容',
  orderId INT NOT NULL COMMENT '所属医院编号  '
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='所属预约编号';



CREATE TABLE cireport (
  cirld INT AUTO_INCREMENT PRIMARY KEY  COMMENT '检查项报告主键',
  cild INT    COMMENT '检查项编号',
  ciName VARCHAR(30)  COMMENT '检查项名称',
  orderld INT NOT NULL COMMENT '所属预约编号  '
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='体检报告检查项信息表';



CREATE TABLE cidetailedreport (
  cidrId INT AUTO_INCREMENT PRIMARY  KEY COMMENT '检查项明细报告编号',
  name VARCHAR(40) NOT NULL COMMENT '检查项明细名称',
  unit VARCHAR(20)  COMMENT '检查项明细单位',
  minrange DOUBLE  COMMENT '检查项细明正常值范围中的最小值',
  maxrange DOUBLE  COMMENT '检查项细明正常值范围中的最大值',
  normalValue VARCHAR(20)  COMMENT '检查项明细正常值(非数字型 )',
  normalValueString VARCHAR(20)  COMMENT '检查项验证范围说明文字',
  type INT NOT NULL   COMMENT '检查项明细类型(1:数值范围验证型，2:数值相等验证型;3:无需验证型;4:描述型 ;5:其它)',
  value VARCHAR(100)  COMMENT '检查项目明细值',
  isError INT NOT NULL COMMENT '此项是否异常(0: 无异常 ;1: 异常 )',
  cild INT NOT NULL   COMMENT '所属检查项报告编号',
  orderld INT NOT NULL COMMENT '所属预约编号  '
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='体检报告检查项明细表';



CREATE TABLE doctor (
  docId INT AUTO_INCREMENT PRIMARY KEY COMMENT '医生编号',
  docCode VARCHAR(20) NOT NULL COMMENT '医生码(登录用 )',
  realName VARCHAR(20) NOT NULL COMMENT '真实姓名',
  password VARCHAR(20) NOT NULL COMMENT '密码(用 )',
  sex INT NOT NULL COMMENT '用户性别 (1: 男;0女)',
  deptno INT NOT NULL COMMENT '所属科室(1: 检验科 ;2 : 内科 ;3 : 外科 )'
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='医生信息表';

INSERT INTO elmboot.doctor
(docCode, realName, password, sex, deptno)
VALUES('123456', '李医生', '123456', '1', 1);


CREATE TABLE users (
  userId VARCHAR(11) PRIMARY KEY COMMENT '用户编号( 手机号码 ',
  password VARCHAR(20) NOT NULL COMMENT '密码',
  realName VARCHAR(20) NOT NULL COMMENT '真实姓名',
  sex INT NOT NULL COMMENT '用户性别 (1: 男;0女)',
  identityCard VARCHAR(18) NOT NULL COMMENT '身份证号',
  birthday date NOT NULL COMMENT '出生日期',
  userType INT NOT NULL COMMENT '用户类型(1: 普通用户 ; 2 : 东软内部员工:3 : 其他 '
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='用户表';


INSERT INTO elmboot.users
(userId, password, realName, sex, identityCard, birthday, userType)
VALUES('12345678900', '123456', '管理员', 0, '123456789214525211', '2023-01-01', 2);








