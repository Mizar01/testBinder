package testbinder

import testapp.*
import grails.converters.*

class TestBinderController {
	
	def grailsWebDataBinder

	def index() {
		println "aaaa"
		def xml = """<?xml version="1.0" encoding="UTF-8"?>
			  <testapp.Documento>
			    <dateCreated>2017-03-03 00:00:00.0 CET</dateCreated>
			    <nomi>
			      <string>kkk</string>
			      <string>iiiii</string>
			    </nomi>
			    <numeroItems>6</numeroItems>
			    <righe>
			       <documentoRiga>
			         <data>2016-10-01 00:00:00.0 CET</data>
			         <ord>1</ord>
			         <prodotto>martello</prodotto>
					</documentoRiga>
			       <documentoRiga>
			         <data>2016-10-02 00:00:00.0 CET</data>
			         <ord>2</ord>
			         <prodotto>orata</prodotto>
					</documentoRiga>
			    </righe>
			    <titolo>jkhgf</titolo>
			  </testapp.Documento>
			"""
		def slurper = new XmlSlurper().parseText(xml)
		def instance = Documento.newInstance()
		grailsWebDataBinder.bind instance, slurper

		JSON.use("deep")
		render instance as JSON


	}


}