package java9r.entites.com;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "product", catalog = "product")
public class Product implements java.io.Serializable {

 private Integer id;
 private String name;
 private Long price;
 private Integer quantity;
 private String description;
 private String photo;
 private Boolean active;
 private Date createiondate;

 public Product() {
 }

 public Product(Date createiondate) {
  this.createiondate = createiondate;
 }

 public Product(String name, Long price, Integer quantity,
   String description, String photo, Boolean active, Date createiondate) {
  this.name = name;
  this.price = price;
  this.quantity = quantity;
  this.description = description;
  this.photo = photo;
  this.active = active;
  this.createiondate = createiondate;
 }

 @Id
 @GeneratedValue(strategy = IDENTITY)
 @Column(name = "id", unique = true, nullable = false)
 public Integer getId() {
  return this.id;
 }

 public void setId(Integer id) {
  this.id = id;
 }

 @Column(name = "name", length = 45)
 public String getName() {
  return this.name;
 }

 public void setName(String name) {
  this.name = name;
 }

 @Column(name = "price", precision = 10, scale = 0)
 public Long getPrice() {
  return this.price;
 }

 public void setPrice(Long price) {
  this.price = price;
 }

 @Column(name = "quantity")
 public Integer getQuantity() {
  return this.quantity;
 }

 public void setQuantity(Integer quantity) {
  this.quantity = quantity;
 }

 @Column(name = "description", length = 450)
 public String getDescription() {
  return this.description;
 }

 public void setDescription(String description) {
  this.description = description;
 }

 @Column(name = "photo", length = 45)
 public String getPhoto() {
  return this.photo;
 }

 public void setPhoto(String photo) {
  this.photo = photo;
 }

 @Column(name = "active")
 public Boolean getActive() {
  return this.active;
 }

 public void setActive(Boolean active) {
  this.active = active;
 }

 @Temporal(TemporalType.TIMESTAMP)
 @Column(name = "createiondate", nullable = false, length = 19)
 public Date getCreateiondate() {
  return this.createiondate;
 }

 public void setCreateiondate(Date createiondate) {
  this.createiondate = createiondate;
 }

}
