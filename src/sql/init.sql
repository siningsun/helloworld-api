-- auto-generated definition
create table user
(
    id          bigint auto_increment
        primary key,
    name        varchar(255)                        null,
    password    varchar(255)                        null,
    create_time timestamp default CURRENT_TIMESTAMP not null,
    modify_time timestamp default CURRENT_TIMESTAMP not null,
    sys_status  tinyint   default 1                 not null comment '1, 有效用户; 2, 无效用户'
);

