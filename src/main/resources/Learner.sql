/* 用户表*/
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