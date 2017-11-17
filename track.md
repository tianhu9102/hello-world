select acid,trackno,min(timestamped) ,max(timestamped),count(1) from RADAR t where trackno=652 group by acid,trackno order by acid,trackno;

create table radar_at tablespace users as
select acid,trackno,min(timestamped) mint,max(timestamped) maxt,count(1) cnt from RADAR t  group by acid,trackno order by acid,trackno;

select * from radar_at;


思路：
（1）统计航迹总条数（即获取acid、trackno）
select acid,trackno,min(timestamped) ,max(timestamped),count(1) 
from RADAR t  
group by acid,trackno order by acid,trackno;

（2）根据acid、trackno唯一确定一次飞行计划
例如获取acid='AAL137'，rackno=75的此次飞行
select * from RADAR where acid='AAL137' and trackno=75 order by timestamped

