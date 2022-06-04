package com.test.miniproject.model;

import javax.persistence.Entity;
import javax.persistence.*;

@Entity
@Table(name = "student")
public class Student {

	 @Id
	 @Column(name="id")
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 private Long id;
	
	 @Column(name = "nama", nullable = false, length = 70)
	 private String nama;

	 @Column(name = "jenis_kelamin", nullable = false, length = 11)
	 private String jenisKelamin;

	 @Column(name = "tempat_lahir", nullable = false, length = 50)
	 private String tempatLahir;
	
	 @Column(name = "agama", nullable = false, length = 30)
	 private String agama;
	 
	 @Column(name = "alamat", nullable = false, length = 100)
	 private String alamat;

	 
	 public String getAgama() {
		return agama;
	}

	public void setAgama(String agama) {
		this.agama = agama;
	}

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}
	
	public String getJenisKelamin() {
		return jenisKelamin;
	}

	public void setJenisKelamin(String jenisKelamin) {
		this.jenisKelamin = jenisKelamin;
	}

	public String getTempatLahir() {
		return tempatLahir;
	}

	public void setTempatLahir(String tempatLahir) {
		this.tempatLahir = tempatLahir;
	}

	public String getAlamat() {
		return alamat;
	}

	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", nama=" + nama + ", jenisKelamin=" + jenisKelamin + ", tempatLahir="
				+ tempatLahir + ", agama=" + agama + ", alamat=" + alamat + "]";
	}
			 
}
