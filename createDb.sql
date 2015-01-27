--
create table article(
	id INTEGER PRIMARY KEY AUTOINCREMENT,
	title	VARCHAR(50),
	content	TEXT,
	author	VARCHAR(50),
	create_dt	DATE,
	update_dt	DATE
);

insert into article(title,content,author,create_dt)
values("hello sqlite3","just for test","shenzl",datetime('now'));