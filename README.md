# java-boot-camp

<!-- TABLE OF CONTENTS -->
<details>
  <summary>Table of Contents</summary>
  <ol>
<<<<<<< HEAD
    <li><a href="#user-journey">User Journey</a></li>
    <li><a href="#logical-diagram">Logical Diagram</a></li>
=======
    <li>
      <a href="#about-the-project">User Journey</a>
      <ul>
        <li><a href="#built-with">Built With</a></li>
      </ul>
    </li>
    <li>
      <a href="#getting-started">Getting Started</a>
      <ul>
        <li><a href="#prerequisites">Prerequisites</a></li>
        <li><a href="#installation">Installation</a></li>
      </ul>
    </li>
    <li><a href="#usage">Usage</a></li>
    <li><a href="#roadmap">Roadmap</a></li>
    <li><a href="#contributing">Contributing</a></li>
    <li><a href="#license">License</a></li>
    <li><a href="#contact">Contact</a></li>
    <li><a href="#acknowledgments">Acknowledgments</a></li>
>>>>>>> 17c11f407a5894f7b9c7fc5869fc64ef33a7b35f
  </ol>
</details>



<!-- TABLE OF CONTENTS -->
## User Journey

ร้านค้า E-commerce รองรับการใช้งานผ่าน web และ Mobile app โดยเป็นร้านค้าเกี่ยวกับ แฟชั่นและสุขภาพ
#### ลูกค้าทำการเข้าใช้งานระบบ โดยจะเข้ามาพบหน้า UI ที่แสดงรายการสินค้า และ ช่องให้ทำการค้นหา 
#### โดยการแสดงสินค้าจะสามารถแสดงรายการสินค้าดังนี้ 
1. แสดงสินค้า Promotion 
2. แสดงสินค้า Top Sales ของเดือนนี้
3. แสดงสินค้า ที่วิเคราะห์รสนิยมของลูกใช้งาน ผ่านพฤติกรรมการใช้งาน เช่น ชนิดที่ชอบคลิกดู ระยะเวลาที่อยู่บนหน้าสินค้าชนิดนั้น ราคาที่สนใจ การซื้อที่ผ่านมา ซื้อชนิดไหน ราคาเท่าไหร ช่วงเดือนไหน
#### การแสดงสินค้าโดยใช้งานผ่านการค้นหา
1. ทำการใส่ชื่อ หรือ รุ่นลงไป และ ในการค้นหาสามารถช่วย correct ในการณีที่เดาได้ว่าทางผู้ใช้งานกรอกชื่อยี่ห้อผิด โดยอาจจะแสดงผลการค้นหาตั้งต้นและมีการแสดงผลแบบเพิ่มเติมโดยทำการแยกหัวข้อการ search ให้เห็น
2. ทำการค้นหาผ่าน filter ที่มีตั้งต้นมาให้ เช่น ประเภท กีฬา หลังจากนั้นไปกำหนด ชนิดของวัสดุอุปกรณ์ได้ เช่น ผ้าใบ หนัง ผิวสัมผัา หยาย หรือ ลื่น
3. ทำการค้นหาโดยมีการทำ filter shorcut ใว้ให้โดยอาจจะมีการทำไว้โดย presenter ที่เป็นผู้เชี่ยวชาญครับ เช่น รองเท้าวิ่งสำหรับสาวๆที่มีเท้าแบน รองเท้าวิ่งสำหรับคนมีน่ำหนักเยอะลดอาการบาดเจ็บ
#### ลูกค้าทำการกด เข้าไปดูสินค้าและแสดงรายละเอียดของสินค้า
1. แสดงชื่อสินค้า รุ่น รหัส คุณลักษณะสินค้า เช่น กว้าง ยาว ขนาด คุณสมบัติการใช้งาน และ แสดงคุณลักษณะพิเศษที่ได้รับการ review จากผู้ซื้อรายก่อนๆ เช่น คุ้มค่า, ใส่สบาย และ ราคาปกติ และ ราคาส่วนลด วันที่โปรโมชั่นลด บอกว่าสามารถผ่อนชำระได้หรือไม่
2. แสดงรายการสินค้าที่คล้ายคลึงกัน
#### หลังจากลูกค้าเข้าไปดูรายละเอียดสินค้าและดำเนินการเช่น
1. ทำการกดเลือกซื้อสินค้า โดยสามารถเลือกคุณลักษณะ ได้เช่น สี ขนาด size หรือ จำนวนที่ซื้อ 
2. ทำการกดติดตามสินค้า(fav)
#### ลูกค้าทำการจ่ายเงินค่าสินค้าและกำหนดที่จัดส่ง โดยมีเงือนไขดังนี้
1. ลูกค้าที่ทำการ login เข้าใช้งานมาแล้วสามารถดำเนินการต่อได้
2. ลูกค้าที่ไม่ได้ทำการ login เข้าระบบจะต้องทำการดำเนินการ login ก่อนและถ้าลูกค้ายังไม่เป็น member ของระบบจะต้องทำการ register member เสียก่อน
#### ลูกค้าทำการสมัครสมาชิกระบบ
1. ลูกค้าทำการกรอกข้อมูล เช่น ชื่อ นามสกุล อายุ เพศ email size เสื้อ, รองเท้า
2. ทำการ confirm email เพื่อเป็นการยืนยันการเข้าใช้งาน
3. สามารถ add family ได้ เช่น ใส่ชื่อ อายุ เพศ size เสื้อ, รองเท้า
4. ทำการ add ที่อยู่เพื่อจัดส่งสินค้า
5. ทำการ add ที่อยู่สำหรับใบกำกับภาษี
6. ทำการมีการละเอียดการขออนุญาติจากผู้ใช้งานในการขอใช้ข้อมูลส่วนบุคคลเพื่อใช้ในการปรับปรุงการให้บริการ
#### ขั้นตอนการชำระค่าสินค้าและบริการ และ ที่จัดส่ง
1. ลูกค้าสามารถใส่ รหัสส่วนลด ที่สามารถลดเพ่ิ่มเติมจาก ตัวสินค้า และ แสดงราคารวมสินค้าทั้งหมด
2. ลูกค้าสามารถเลือกรูปแบบการชำระสินค้าเช่น
   - บัตรเครดิต
     - รองรับการผ่อนชำระ
   - true money
   - โอนผ่านบัญชีธนาคาร
   - crypto currency เช่น bitkub หรือ กรณีที่ออกเหรีญเอง (อะไรสักอย่าง coil) ***Optional วางแผนไว้
#### หลังจากชำระเงินเสร็จแล้ว จะต้องทำการเลือกสถานที่จัดส่ง โดยสามารถเลือกหรือเพ่ิมใหม่และแก้ไขได้
1. ทำการเพิ่มที่อยู่กรณีไม่ได้มีการกำหนดที่อยู่ โดยทำการ search ผ่าน google map และ mark จุด หรือ พิมพ์ที่อยู่แล้วนำไปค้นหาผ่าน google map เพื่อให้ confirm 
2. ทำการเลือกที่อยู่ที่มีการบันทึกไว้แล้ว
3. ทำการตรวจสอบสถานที่จัดส่งและ gps และทำการ alert เพื่อนบอกว่า สถานที่ปัจจุบันกับที่จัดส่งคนละที่กัน เพื่อให้ได้ทำการ re-check และยืนยัน
4. เลือกวิธีการจัดส่ง เช่น ขนส่งบริษัท , grab , lalamove หรือ ไปรับผ่านร้านสะดวกซื้อเช่น 7eleven หรือ มินิมาร์ท
5. ในกรณีที่จะให้ไปรับผ่าน ร้านสะดวกซื้อ หรือ จุดบริการรับของ สามารถใช้ google map ในการค้นหาและปักมุดได้

#### หลังจากทำการซื้อสำเร็จ ลูกค้าสามารถตรวจสอบสถานะการรับส่งสินค้าได้
1. แสดงสถานะ เช่น สถานะการจ่ายเงิน , กำลังเตรียมพัสดุ, กำลังจัดส่ง, อยู่ระหว่างขนส่ง
2. การแสดงสถานะ การจ่ายเงิน ถ้าเป็นการโอนต้องรอตรวจสอบการโอนก่อน แล้วถึงเปลี่ยนสถานะการจ่ายเงินเป็น จ่ายแล้ว

<<<<<<< HEAD
## Logical Diagram
![image](https://github.com/gambitmis/java-boot-camp/blob/main/java-boot-camp-week1.png?raw=true)

## API 
| Method  | Url | Description |
| ------------- | ------------- | ------------- |
| GET | /api/v1/products/:num  | show number list products 
| GET | /api/v1/products/promotion/:num | show number list of promotoin products
| GET | /api/v1/products/top
| GET | /api/v1/product/:id
| POST | /api/v1/signin/
| POST | /api/v1/singup/


=======
![image](https://github.com/gambitmis/java-boot-camp/blob/main/java-boot-camp-week1.png?raw=true)
>>>>>>> 17c11f407a5894f7b9c7fc5869fc64ef33a7b35f
