DROP DATABASE IF EXISTS noxml-test;

CREATE DATABASE IF NOT EXISTS noxml-test default charset utf8mb4 COLLATE utf8mb4_unicode_ci;

use noxml-test;

CREATE TABLE `base_region` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `region` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '区域',
  `subtype_name` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '产品名称',
  `subtype_id` int(11) NOT NULL COMMENT '产品id',
  `is_global` int(10) NOT NULL DEFAULT '0' COMMENT '是否海外',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci ROW_FORMAT=DYNAMIC;


insert into `noxml-test`.`base_region` ( `id`, `region`, `subtype_name`, `subtype_id`, `is_global`) values ( '1', 'ap-beijing', 'tencent_cn-cvm', '5', '0');
insert into `noxml-test`.`base_region` ( `id`, `region`, `subtype_name`, `subtype_id`, `is_global`) values ( '2', 'ap-beijing', 'tencent_cn-cdb', '6', '0');
insert into `noxml-test`.`base_region` ( `id`, `region`, `subtype_name`, `subtype_id`, `is_global`) values ( '3', 'ap-beijing', 'tencent_cn-cos', '7', '0');
insert into `noxml-test`.`base_region` ( `id`, `region`, `subtype_name`, `subtype_id`, `is_global`) values ( '4', 'cn-northwest-1', 'aws_cn-s3', '4', '0');
insert into `noxml-test`.`base_region` ( `id`, `region`, `subtype_name`, `subtype_id`, `is_global`) values ( '5', 'cn-northwest-1', 'aws_cn-rds', '3', '0');
insert into `noxml-test`.`base_region` ( `id`, `region`, `subtype_name`, `subtype_id`, `is_global`) values ( '6', 'cn-northwest-1', 'aws_cn-redis', '25', '0');
insert into `noxml-test`.`base_region` ( `id`, `region`, `subtype_name`, `subtype_id`, `is_global`) values ( '7', 'cn-north-1', 'huawei_cn-ecs', '8', '0');
insert into `noxml-test`.`base_region` ( `id`, `region`, `subtype_name`, `subtype_id`, `is_global`) values ( '8', 'cn-north-1', 'aws_cn-ec2', '2', '0');