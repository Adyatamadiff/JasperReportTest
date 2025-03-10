# JasperReportTest


*** WORK IN PROGRESS ***

DB Name : Jasper

Table 1
" Employee "
| Name | Type |
| :---:   | :---: |
| empid | bigint   |
| empname | character varying   |
| department | character varying   |
| salary | double precision   |

_________________
spring.datasource.url=jdbc:postgresql://127.0.0.1:5432/Jasper
spring.datasource.username=postgres
spring.datasource.password=1234
_________________

To generate report you can user 'Postman' and hit "http://127.0.0.1:80/employee/generateReport" Method = GET

Result at "src/main/resources/static"


****
Notes:

Perlu ubah path manual di "EmployeeReportService" karena template report dan destination masih static value

Untuk Spring Jasper Report ini saya masih mencoba-coba dan belum sepenuhnya memahami fitur dan fungsinya, dan saya juga masih belum paham terkait expected goal dari format report yang diberikan.
Belum terbayang bagaimana bentuk dan caranya tapi sudah memahami sedikit dasar dari JasperReport ini dan beberapa fungsi dasar yang sudah ada di project ini.
