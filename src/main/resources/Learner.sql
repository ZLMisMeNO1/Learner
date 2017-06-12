create database osbullshit_Learner;
use osbullshit_Learner;
/* 用户表 */
create table tb_learner_user(
	id varchar(30) primary key,
	name varchar(255) not null,
	openId varchar(255) not null
);
insert into tb_learner_user values ("a","a","a");
insert into tb_learner_user values ("b","b","b");
insert into tb_learner_user values ("c","c","c");
insert into tb_learner_user values ("d","中文测试","中文测试");

select * from tb_learner_user;

/*试题以及答案*/
create table tb_learner_qAndA (
	id varchar(255) primary key,
	userId varchar(30) ,
	title varchar(255) not null,
	question varchar(255) not null,
	answer varchar(300) not null,
	isDelete int not null,
	update_time TIMESTAMP ,
	language varchar(30) not null,
	sortNum int not null
);
drop table tb_learner_qAndA;
select * from  tb_learner_qAndA;
insert into tb_learner_qAndA(id,title,question,answer,isDelete,language,sortNum)
	values ("607c4409-8936-4f81-bf83-45abda0f33f1","String,StringBuffer, StringBuilder 的区别是什么","String,StringBuffer, StringBuilder 的区别是什么？String为什么是不可变的？","1、String是字符串常量，StringBuffer和StringBuilder都是字符串变量。后两者的字符内容可变，而前者创建后内容不可变。

2、String不可变是因为在JDK中String类被声明为一个final类。

3、StringBuffer是线程安全的，而StringBuilder是非线程安全的。

ps：线程安全会带来额外的系统开销，所以StringBuilder的效率比StringBuffer高。如果对系统中的线程是否安全很掌握，可用StringBuffer，在线程不安全处加上关键字Synchronize。",0,"java",1);
insert into tb_learner_qAndA(id,title,question,answer,isDelete,language,sortNum)
	values ("cd56d2bd-96cf-4f0e-a3e3-7551c374945e","什么是认知？","认知是什么?","认知是一个过程",0,"java",2);



/* 新增试题中间表 */
create table tb_learner_addQuestionAnswer(
	id varchar(255) primary key,
	userId varchar(255) ,
	title varchar(255) not null,
	question varchar(255) not null,
	answer varchar(300) not null,
	update_time TIMESTAMP ,
	language varchar(30) not null,
	canOk boolean ,
	agree int  default 0,
	disagree int  default 0
);
drop table tb_learner_addQuestionAnswer;
