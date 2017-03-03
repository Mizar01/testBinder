package testapp

class Documento implements Serializable {


	Date dateCreated
	String titolo
	Integer numeroItems
	List<String> nomi

	static hasMany = [righe: DocumentoRiga]

	static mapping = {
		version false
	}
}