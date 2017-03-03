package testapp

class DocumentoRiga implements Serializable {

	int ord
	String prodotto
	Date data

	static belongsTo = [documento: Documento]

	static mapping = {
		id composite: ['documento', 'ord'], generator: 'assigned'
		version false
	}
}