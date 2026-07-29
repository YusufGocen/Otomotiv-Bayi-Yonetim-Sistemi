## Otomotiv Bayi Yönetim Sistemi :

Bir otomotiv bayisinde araç, bayi, müşteri, satış, hesap ve adres işlemlerinin tek bir sistem üzerinden yönetebilen katmanlı mimariye sahip bir Spring Boot Projesidir.

## Özellikler
- 🏢 Bayi kayıtları yönetilebilir.
- 🔗 Bayilere araç tanımlanabilir.
- 👤 Müşteri kayıtları oluşturulabilir.
- 🚘 Araç satış işlemleri gerçekleştirilebilir.
- 🏠 Hesap ve adres bilgileri yönetilebilir.
- 🔐 Kullanıcı doğrulama işlemleri güvenli şekilde gerçekleştirilebilir.
- 💱 Döviz kuru entegrasyonu:


## Kullanılan Teknolojiler
- Java 
- Spring Boot 
- Spring Data JPA / Hibernate
- Spring Security
- PostgreSQL
- JWT 
- Lombok
- Maven
- Swagger


## Proje Mimarisi

- controller/       
- service/          
- repository/        
- model/             
- dto/               
- enums/             
- exception/        
- handler/           
- jwt/               
- config/           
- starter/     
 

## Veritabanı Yapısı

Projedeki Tablolar

- User
- RefreshToken
- Customer
- Dealer
- DealerCar
- Car
- SoldCar
- Account
- Address

## 🔐 Kimlik Doğrulama

Projede Spring Security ve JWT Authentication kullanılmaktadır.

Kimlik doğrulama süreci aşağıdaki şekilde çalışmaktadır.

1. Kullanıcı giriş yapar.
2. Access Token oluşturulur.
3. Refresh Token oluşturulur.
4. Korunan endpointlere Access Token ile erişilir.
5. Token süresi dolduğunda Refresh Token kullanılarak yeni Access Token alınır.



### Yetkilendirme Gerektirmeyen Endpoint'ler

| HTTP Metodu | Endpoint | Açıklama |
|-------------|----------|----------|
| **POST** | `/register` | Yeni kullanıcı kaydı oluşturur. |
| **POST** | `/authenticate` | Kullanıcı girişi yapar ve Access Token ile Refresh Token döndürür. |
| **POST** | `/refreshToken` | Refresh Token kullanarak yeni bir Access Token oluşturur. |

---

### Erişim Yetkisi Gerektiren Endpoint'ler


| HTTP Metodu | Endpoint | Açıklama |
|-------------|----------|----------|
| **POST** | `/rest/api/customer/save` | Yeni müşteri kaydı oluşturur. |
| **POST** | `/rest/api/gallerist/save` | Yeni bayi kaydı oluşturur. |
| **POST** | `/rest/api/car/save` | Yeni araç kaydı oluşturur. |
| **POST** | `/rest/api/gallerist-car/save` | Bir bayiye araç tanımlar. |
| **POST** | `/rest/api/saled-car/save` | Araç satış işlemini gerçekleştirir. |
| **POST** | `/rest/api/account/save` | Hesap bilgilerini kaydeder. |
| **POST** | `/rest/api/address/save` | Adres bilgilerini kaydeder. |
| **GET** | `/rest/api/currency-rates?startDate=...&endDate=...` | TCMB verileri üzerinden belirtilen tarih aralığındaki USD/TL kur bilgilerini getirir. |
