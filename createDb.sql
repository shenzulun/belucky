--
create table t_article(
	id INTEGER PRIMARY KEY AUTOINCREMENT,
	title	VARCHAR(50),
	content	TEXT,
	author	VARCHAR(50),
	create_dt	DATE,
	update_dt	DATE
);

insert into t_article(title,content,author,create_dt)
values("hello sqlite3","just for test","shenzl",datetime('now'));

create table t_user(
	id INTEGER PRIMARY KEY AUTOINCREMENT,
	userNo	varchar(20)	unique,
	password	varchar(200),
	create_dt	DATE,
	status	varchar(10)
);

insert into t_user(userNo,password,create_dt) values("shenzl","shenzl",datetime('now'));
