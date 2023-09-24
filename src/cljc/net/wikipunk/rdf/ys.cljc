(ns net.wikipunk.rdf.ys
  ^{:base "http://yago-knowledge.org/schema#",
    :namespaces
    {"cc"       "http://creativecommons.org/ns#",
     "data"     "https://www.wikidata.org/wiki/Special:EntityData/",
     "dcterms"  "http://purl.org/dc/terms/",
     "geo"      "http://www.opengis.net/ont/geosparql#",
     "ontolex"  "http://www.w3.org/ns/lemon/ontolex#",
     "owl"      "http://www.w3.org/2002/07/owl#",
     "p"        "http://www.wikidata.org/prop/",
     "pq"       "http://www.wikidata.org/prop/qualifier/",
     "pqn"      "http://www.wikidata.org/prop/qualifier/value-normalized/",
     "pqv"      "http://www.wikidata.org/prop/qualifier/value/",
     "pr"       "http://www.wikidata.org/prop/reference/",
     "prn"      "http://www.wikidata.org/prop/reference/value-normalized/",
     "prov"     "http://www.w3.org/ns/prov#",
     "prv"      "http://www.wikidata.org/prop/reference/value/",
     "ps"       "http://www.wikidata.org/prop/statement/",
     "psn"      "http://www.wikidata.org/prop/statement/value-normalized/",
     "psv"      "http://www.wikidata.org/prop/statement/value/",
     "rdf"      "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
     "rdfs"     "http://www.wikidata.org/entity/statement/",
     "ref"      "http://www.wikidata.org/reference/",
     "schema"   "http://schema.org/",
     "sh"       "http://www.w3.org/ns/shacl#",
     "skos"     "http://www.w3.org/2004/02/skos/core#",
     "v"        "http://www.wikidata.org/value/",
     "wd"       "http://www.wikidata.org/entity/",
     "wdno"     "http://www.wikidata.org/prop/novalue/",
     "wdt"      "http://www.wikidata.org/prop/direct/",
     "wdtn"     "http://www.wikidata.org/prop/direct-normalized/",
     "wikibase" "http://wikiba.se/ontology#",
     "wpq"      "http://www.wikidata.org/prop/quant/",
     "xsd"      "http://www.w3.org/2001/XMLSchema#",
     "yago"     "http://yago-knowledge.org/resource/",
     "ys"       "http://yago-knowledge.org/schema#"},
    :prefix "ys",
    :source "net/wikipunk/yago/yago-schema.ttl"}
  {:rdf/type :owl/Ontology})

(def Academic_property_231
  {:db/ident        :ys/Academic_property_231,
   :sh/node         :schema/Person,
   :sh/path         :yago/studentOf,
   :ys/fromProperty :wdt/P1066})

(def Academic_property_232
  {:db/ident        :ys/Academic_property_232,
   :sh/node         :schema/Person,
   :sh/path         :yago/doctoralAdvisor,
   :ys/fromProperty :wdt/P184})

(def AdministrativeArea_property_249
  {:db/ident        :ys/AdministrativeArea_property_249,
   :sh/datatype     :xsd/dateTime,
   :sh/maxCount     1,
   :sh/path         :schema/dateCreated,
   :ys/fromProperty :wdt/P571})

(def AdministrativeArea_property_250
  {:db/ident        :ys/AdministrativeArea_property_250,
   :sh/datatype     :xsd/string,
   :sh/path         :schema/demonym,
   :ys/fromProperty :wdt/P1549})

(def AdministrativeArea_property_251
  {:db/ident        :ys/AdministrativeArea_property_251,
   :sh/node         :schema/Person,
   :sh/path         :schema/leader,
   :ys/fromProperty #{:wdt/P6 :wdt/P35}})

(def AdministrativeArea_property_252
  {:db/ident        :ys/AdministrativeArea_property_252,
   :sh/node         :schema/AdministrativeArea,
   :sh/path         :yago/replaces,
   :ys/fromProperty :wdt/P1365})

(def AdministrativeArea_property_253
  {:db/ident        :ys/AdministrativeArea_property_253,
   :sh/datatype     :xsd/decimal,
   :sh/path         :schema/populationNumber,
   :ys/fromProperty :wdt/P1082})

(def AdministrativeArea_property_254
  {:db/ident        :ys/AdministrativeArea_property_254,
   :sh/datatype     :xsd/string,
   :sh/path         :schema/postalCode,
   :ys/fromProperty :wdt/P281})

(def AdministrativeArea_property_255
  {:db/ident        :ys/AdministrativeArea_property_255,
   :sh/datatype     :xsd/string,
   :sh/path         :schema/motto,
   :ys/fromProperty :wdt/P1451})

(def AdministrativeArea_property_256
  {:db/ident        :ys/AdministrativeArea_property_256,
   :sh/node         :schema/Organization,
   :sh/path         :schema/memberOf,
   :ys/fromProperty :wdt/P463})

(def AdministrativeArea_property_257
  {:db/ident        :ys/AdministrativeArea_property_257,
   :sh/node         :schema/Place,
   :sh/path         :schema/administrates,
   :ys/fromProperty :wdt/P150})

(def AdministrativeArea_property_258
  {:db/ident        :ys/AdministrativeArea_property_258,
   :sh/node         :schema/City,
   :sh/path         :yago/capital,
   :ys/fromProperty :wdt/P36})

(def Airline_property_185
  {:db/ident        :ys/Airline_property_185,
   :sh/datatype     :xsd/string,
   :sh/maxCount     1,
   :sh/path         :schema/iataCode,
   :sh/pattern      "^[A-Z0-9]{2}$",
   :ys/fromProperty :wdt/P229})

(def Airline_property_186
  {:db/ident        :ys/Airline_property_186,
   :sh/datatype     :xsd/string,
   :sh/maxCount     1,
   :sh/path         :schema/icaoCode,
   :sh/pattern      "^[A-Z]{3}$",
   :ys/fromProperty :wdt/P230})

(def Airport_property_272
  {:db/ident        :ys/Airport_property_272,
   :sh/datatype     :xsd/string,
   :sh/maxCount     1,
   :sh/path         :schema/iataCode,
   :sh/pattern      "^[A-Z]{3}$",
   :ys/fromProperty :wdt/P238})

(def Airport_property_273
  {:db/ident        :ys/Airport_property_273,
   :sh/datatype     :xsd/string,
   :sh/maxCount     1,
   :sh/path         :schema/icaoCode,
   :sh/pattern      "^([A-Z]{2}|[CKY][A-Z0-9])[A-Z0-9]{2}$",
   :ys/fromProperty :wdt/P239})

(def AnnotationPropertyShape
  {:db/ident :ys/AnnotationPropertyShape,
   :rdf/type :rdf/Property,
   :rdfs/subPropertyOf :sh/PropertyShape})

(def AstronomicalObject_property_243
  {:db/ident        :ys/AstronomicalObject_property_243,
   :sh/node         :yago/AstronomicalObject,
   :sh/path         :yago/parentBody,
   :ys/fromProperty :wdt/P397})

(def AstronomicalObject_property_244
  {:db/ident        :ys/AstronomicalObject_property_244,
   :sh/datatype     :xsd/decimal,
   :sh/path         :yago/mass,
   :ys/fromProperty :wdt/P2067})

(def AstronomicalObject_property_245
  {:db/ident        :ys/AstronomicalObject_property_245,
   :sh/datatype     :xsd/decimal,
   :sh/path         :yago/luminosity,
   :ys/fromProperty :wdt/P2060})

(def AstronomicalObject_property_246
  {:db/ident        :ys/AstronomicalObject_property_246,
   :sh/datatype     :xsd/decimal,
   :sh/path         :yago/parallax,
   :ys/fromProperty :wdt/P2214})

(def AstronomicalObject_property_247
  {:db/ident        :ys/AstronomicalObject_property_247,
   :sh/datatype     :xsd/decimal,
   :sh/path         :yago/radialVelocity,
   :ys/fromProperty :wdt/P2216})

(def AstronomicalObject_property_248
  {:db/ident        :ys/AstronomicalObject_property_248,
   :sh/datatype     :xsd/decimal,
   :sh/path         :yago/distanceFromEarth,
   :ys/fromProperty :wdt/P2583})

(def Award_property_13
  {:db/ident        :ys/Award_property_13,
   :sh/or           :ys/list_14,
   :sh/path         :yago/conferredBy,
   :ys/fromProperty :wdt/P1027})

(def BodyOfWater_property_262
  {:db/ident        :ys/BodyOfWater_property_262,
   :sh/node         :schema/BodyOfWater,
   :sh/path         :yago/flowsInto,
   :ys/fromProperty #{:wdt/P403 :wdt/P201}})

(def Book_property_39
  {:db/ident :ys/Book_property_39,
   :sh/datatype :xsd/string,
   :sh/maxCount 1,
   :sh/path :schema/isbn,
   :sh/pattern
   "^(97[89]-([0-57]-(\\d-\\d{7}|\\d\\d-\\d{6}|\\d\\d\\d-\\d{5}|\\d{4}-\\d{4}|\\d{5}-\\d\\d\\d|\\d{6}-\\d\\d|\\d{7}-\\d)|[89]\\d-(\\d-\\d{6}|\\d\\d-\\d{5}|\\d\\d\\d-\\d{4}|\\d{4}-\\d\\d\\d|\\d{5}-\\d\\d|\\d{6}-\\d)|[69]\\d\\d-(\\d-\\d{5}|\\d\\d-\\d{4}|\\d\\d\\d-\\d\\d\\d|\\d{4}-\\d\\d|\\d{5}-\\d)|99[0-8]\\d-\\d-\\d{4}|99[0-8]\\d-\\d\\d-\\d\\d\\d|99[0-8]\\d-\\d\\d\\d-\\d\\d|99[0-8]\\d-\\d{4}-\\d|999\\d\\d-\\d-\\d\\d\\d|999\\d\\d-\\d\\d-\\d\\d|999\\d\\d-\\d\\d\\d-\\d)-\\d|\\d{9}(\\d|X))|(\\d{1,5}-\\d{1,7}-\\d{1,6}-[0-9X])$",
   :ys/fromProperty #{:wdt/P212 :wdt/P957}})

(def Book_property_40
  {:db/ident        :ys/Book_property_40,
   :sh/node         :schema/Person,
   :sh/path         :schema/illustrator,
   :ys/fromProperty :wdt/P110})

(def Book_property_41
  {:db/ident        :ys/Book_property_41,
   :sh/node         :schema/Person,
   :sh/path         :schema/editor,
   :ys/fromProperty :wdt/P98})

(def Book_property_42
  {:db/ident        :ys/Book_property_42,
   :sh/maxCount     1,
   :sh/or           :ys/list_43,
   :sh/path         :schema/publisher,
   :ys/fromProperty :wdt/P123})

(def Book_property_48
  {:db/ident        :ys/Book_property_48,
   :sh/datatype     :xsd/decimal,
   :sh/maxCount     1,
   :sh/path         :schema/numberOfPages,
   :ys/fromProperty :wdt/P1104})

(def Class_property_10
  {:db/ident        :ys/Class_property_10,
   :sh/datatype     :rdf/langString,
   :sh/path         :rdfs/label,
   :sh/uniqueLang   true,
   :ys/fromProperty :schema/name})

(def Class_property_11
  {:db/ident        :ys/Class_property_11,
   :sh/datatype     :xsd/string,
   :sh/path         :schema/sameAs,
   :ys/fromProperty #{:wdt/P345 :wdt/P1053 :wdt/P646 :wdt/P2671}})

(def Class_property_12
  {:db/ident    :ys/Class_property_12,
   :sh/datatype :xsd/anyURI,
   :sh/path     :schema/mainEntityOfPage})

(def Class_property_8
  {:db/ident        :ys/Class_property_8,
   :sh/datatype     :rdf/langString,
   :sh/path         :schema/alternateName,
   :ys/fromProperty :skos/altLabel})

(def Class_property_9
  {:db/ident        :ys/Class_property_9,
   :sh/datatype     :rdf/langString,
   :sh/path         :rdfs/comment,
   :sh/uniqueLang   true,
   :ys/fromProperty :schema/description})

(def Country_property_259
  {:db/ident        :ys/Country_property_259,
   :sh/node         :schema/Language,
   :sh/path         :schema/officialLanguage,
   :ys/fromProperty :wdt/P37})

(def Country_property_260
  {:db/ident        :ys/Country_property_260,
   :sh/datatype     :xsd/decimal,
   :sh/path         :schema/humanDevelopmentIndex,
   :ys/fromProperty :wdt/P1081})

(def Country_property_261
  {:db/ident        :ys/Country_property_261,
   :sh/datatype     :xsd/decimal,
   :sh/path         :schema/unemploymentRate,
   :ys/fromProperty :wdt/P1198})

(def CreativeWork_property_19
  {:db/ident        :ys/CreativeWork_property_19,
   :sh/node         :schema/Thing,
   :sh/path         :schema/about,
   :ys/fromProperty :wdt/P921})

(def CreativeWork_property_20
  {:db/ident        :ys/CreativeWork_property_20,
   :sh/node         :yago/Award,
   :sh/path         :schema/award,
   :ys/fromProperty :wdt/P166})

(def CreativeWork_property_21
  {:db/ident        :ys/CreativeWork_property_21,
   :sh/or           :ys/list_22,
   :sh/path         :schema/author,
   :ys/fromProperty #{:wdt/P170 :wdt/P50}})

(def CreativeWork_property_27
  {:db/ident        :ys/CreativeWork_property_27,
   :sh/node         :schema/Place,
   :sh/path         :schema/contentLocation,
   :ys/fromProperty :wdt/P840})

(def CreativeWork_property_28
  {:db/ident        :ys/CreativeWork_property_28,
   :sh/maxCount     1,
   :sh/or           :ys/list_29,
   :sh/path         :schema/dateCreated,
   :ys/fromProperty :wdt/P571})

(def CreativeWork_property_38
  {:db/ident        :ys/CreativeWork_property_38,
   :sh/node         :schema/Language,
   :sh/path         :schema/inLanguage,
   :ys/fromProperty :wdt/P407})

(def Creator_property_229
  {:db/ident        :ys/Creator_property_229,
   :sh/node         :schema/Thing,
   :sh/path         :schema/influencedBy,
   :ys/fromProperty #{:wdt/P941 :wdt/P737}})

(def Creator_property_230
  {:db/ident        :ys/Creator_property_230,
   :sh/node         :schema/CreativeWork,
   :sh/path         :yago/notableWork,
   :ys/fromProperty :wdt/P800})

(def EducationalOrganization_property_187
  {:db/ident        :ys/EducationalOrganization_property_187,
   :sh/datatype     :xsd/decimal,
   :sh/path         :yago/studentsCount,
   :ys/fromProperty :wdt/P2196})

(def Event_property_105
  {:db/ident        :ys/Event_property_105,
   :sh/node         :schema/Thing,
   :sh/path         :schema/about,
   :ys/fromProperty :wdt/P921})

(def Event_property_106
  {:db/ident        :ys/Event_property_106,
   :sh/node         :schema/Place,
   :sh/path         :schema/location,
   :ys/fromProperty #{:wdt/P4552 :wdt/P706 :wdt/P131 :wdt/P276}})

(def Event_property_107
  {:db/ident        :ys/Event_property_107,
   :sh/or           :ys/list_108,
   :sh/path         :schema/organizer,
   :ys/fromProperty :wdt/P664})

(def Event_property_113
  {:db/ident        :ys/Event_property_113,
   :sh/maxCount     1,
   :sh/or           :ys/list_114,
   :sh/path         :schema/startDate,
   :ys/fromProperty :wdt/P580})

(def Event_property_123
  {:db/ident        :ys/Event_property_123,
   :sh/maxCount     1,
   :sh/or           :ys/list_124,
   :sh/path         :schema/endDate,
   :ys/fromProperty :wdt/P582})

(def Event_property_133
  {:db/ident        :ys/Event_property_133,
   :sh/or           :ys/list_134,
   :sh/path         :schema/sponsor,
   :ys/fromProperty :wdt/P859})

(def Event_property_139
  {:db/ident        :ys/Event_property_139,
   :sh/node         :schema/Event,
   :sh/path         :yago/follows,
   :ys/fromProperty :wdt/P155})

(def Event_property_140
  {:db/ident        :ys/Event_property_140,
   :sh/or           :ys/list_141,
   :sh/path         :yago/participant,
   :ys/fromProperty #{:wdt/P710 :wdt/P1923}})

(def Event_property_146
  {:db/ident        :ys/Event_property_146,
   :sh/node         :schema/Event,
   :sh/path         :schema/superEvent,
   :ys/fromProperty :wdt/P361})

(def FictionalEntity_property_97
  {:db/ident        :ys/FictionalEntity_property_97,
   :sh/node         :schema/CreativeWork,
   :sh/path         :yago/appearsIn,
   :ys/fromProperty #{:wdt/P1080 :wdt/P1441 :wdt/P4584}})

(def FictionalEntity_property_98
  {:db/ident        :ys/FictionalEntity_property_98,
   :sh/node         :schema/Person,
   :sh/path         :schema/performer,
   :ys/fromProperty :wdt/P175})

(def FictionalEntity_property_99
  {:db/ident        :ys/FictionalEntity_property_99,
   :sh/or           :ys/list_100,
   :sh/path         :schema/author,
   :ys/fromProperty #{:wdt/P170 :wdt/P50}})

(def HumanMadeGeographicalEntity_property_263
  {:db/ident        :ys/HumanMadeGeographicalEntity_property_263,
   :sh/or           :ys/list_264,
   :sh/path         :schema/ownedBy,
   :ys/fromProperty #{:wdt/P749 :wdt/P127}})

(def HumanMadeGeographicalEntity_property_269
  {:db/ident        :ys/HumanMadeGeographicalEntity_property_269,
   :sh/datatype     :xsd/dateTime,
   :sh/maxCount     1,
   :sh/path         :schema/dateCreated,
   :ys/fromProperty :wdt/P571})

(def Movie_property_86
  {:db/ident        :ys/Movie_property_86,
   :sh/node         :schema/Person,
   :sh/path         :schema/actor,
   :ys/fromProperty :wdt/P161})

(def Movie_property_87
  {:db/ident        :ys/Movie_property_87,
   :sh/node         :schema/Place,
   :sh/path         :schema/locationCreated,
   :ys/fromProperty :wdt/P495})

(def Movie_property_88
  {:db/ident        :ys/Movie_property_88,
   :sh/or           :ys/list_89,
   :sh/path         :schema/musicBy,
   :ys/fromProperty :wdt/P86})

(def Movie_property_94
  {:db/ident        :ys/Movie_property_94,
   :sh/node         :schema/Person,
   :sh/path         :schema/director,
   :ys/fromProperty :wdt/P57})

(def Movie_property_95
  {:db/ident        :ys/Movie_property_95,
   :sh/datatype     :xsd/decimal,
   :sh/maxCount     1,
   :sh/path         :schema/duration,
   :ys/fromProperty :wdt/P2047})

(def Movie_property_96
  {:db/ident        :ys/Movie_property_96,
   :sh/node         :schema/Organization,
   :sh/path         :schema/productionCompany,
   :ys/fromProperty :wdt/P272})

(def MusicComposition_property_73
  {:db/ident        :ys/MusicComposition_property_73,
   :sh/or           :ys/list_74,
   :sh/path         :schema/musicBy,
   :ys/fromProperty :wdt/P86})

(def MusicComposition_property_79
  {:db/ident        :ys/MusicComposition_property_79,
   :sh/datatype     :xsd/string,
   :sh/maxCount     1,
   :sh/path         :schema/iswcCode,
   :sh/pattern      "^T-[0-9]{3}\\.[0-9]{3}\\.[0-9]{3}-[0-9]$",
   :ys/fromProperty :wdt/P1827})

(def MusicComposition_property_80
  {:db/ident        :ys/MusicComposition_property_80,
   :sh/or           :ys/list_81,
   :sh/path         :schema/lyricist,
   :ys/fromProperty :wdt/P676})

(def MusicGroup_property_191
  {:db/ident        :ys/MusicGroup_property_191,
   :sh/node         :schema/Thing,
   :sh/path         :schema/influencedBy,
   :ys/fromProperty #{:wdt/P941 :wdt/P737}})

(def MusicGroup_property_192
  {:db/ident        :ys/MusicGroup_property_192,
   :sh/node         :schema/Organization,
   :sh/path         :schema/recordLabel,
   :ys/fromProperty :wdt/P264})

(def Newspaper_property_49
  {:db/ident        :ys/Newspaper_property_49,
   :sh/maxCount     1,
   :sh/or           :ys/list_50,
   :sh/path         :schema/publisher,
   :ys/fromProperty :wdt/P123})

(def Newspaper_property_55
  {:db/ident        :ys/Newspaper_property_55,
   :sh/or           :ys/list_56,
   :sh/path         :schema/sponsor,
   :ys/fromProperty :wdt/P859})

(def Organization_property_147
  {:db/ident        :ys/Organization_property_147,
   :sh/node         :yago/Award,
   :sh/path         :schema/award,
   :ys/fromProperty :wdt/P166})

(def Organization_property_148
  {:db/ident        :ys/Organization_property_148,
   :sh/node         :schema/Place,
   :sh/path         :schema/locationCreated,
   :ys/fromProperty #{:wdt/P740 :wdt/P495}})

(def Organization_property_149
  {:db/ident        :ys/Organization_property_149,
   :sh/node         :schema/Place,
   :sh/path         :schema/location,
   :ys/fromProperty #{:wdt/P4552 :wdt/P159 :wdt/P706 :wdt/P131 :wdt/P17
                      :wdt/P276}})

(def Organization_property_150
  {:db/ident        :ys/Organization_property_150,
   :sh/datatype     :xsd/anyURI,
   :sh/path         :schema/logo,
   :ys/fromProperty :wdt/P154})

(def Organization_property_151
  {:db/ident        :ys/Organization_property_151,
   :sh/maxCount     1,
   :sh/or           :ys/list_152,
   :sh/path         :schema/dissolutionDate,
   :ys/fromProperty :wdt/P576})

(def Organization_property_161
  {:db/ident        :ys/Organization_property_161,
   :sh/datatype     :xsd/string,
   :sh/maxCount     1,
   :sh/path         :schema/duns,
   :sh/pattern      "^\\d{9}$",
   :ys/fromProperty :wdt/P2771})

(def Organization_property_162
  {:db/ident        :ys/Organization_property_162,
   :sh/node         :schema/Person,
   :sh/path         :schema/founder,
   :ys/fromProperty :wdt/P112})

(def Organization_property_163
  {:db/ident        :ys/Organization_property_163,
   :sh/node         :schema/Person,
   :sh/path         :schema/leader,
   :ys/fromProperty #{:wdt/P6 :wdt/P1075 :wdt/P169 :wdt/P168 :wdt/P35}})

(def Organization_property_164
  {:db/ident        :ys/Organization_property_164,
   :sh/datatype     :xsd/string,
   :sh/path         :schema/motto,
   :ys/fromProperty :wdt/P1451})

(def Organization_property_165
  {:db/ident        :ys/Organization_property_165,
   :sh/datatype     :xsd/string,
   :sh/path         :schema/address,
   :ys/fromProperty :wdt/P6375})

(def Organization_property_166
  {:db/ident        :ys/Organization_property_166,
   :sh/maxCount     1,
   :sh/or           :ys/list_167,
   :sh/path         :schema/dateCreated,
   :ys/fromProperty :wdt/P571})

(def Organization_property_176
  {:db/ident        :ys/Organization_property_176,
   :sh/datatype     :xsd/string,
   :sh/maxCount     1,
   :sh/path         :schema/leiCode,
   :sh/pattern      "^[0-9A-Z]{18}[0-9]{2}$",
   :ys/fromProperty :wdt/P1278})

(def Organization_property_177
  {:db/ident        :ys/Organization_property_177,
   :sh/node         :schema/Organization,
   :sh/path         :schema/memberOf,
   :ys/fromProperty #{:wdt/P463 :wdt/P114}})

(def Organization_property_178
  {:db/ident        :ys/Organization_property_178,
   :sh/datatype     :xsd/decimal,
   :sh/path         :schema/numberOfEmployees,
   :ys/fromProperty :wdt/P1128})

(def Organization_property_179
  {:db/ident        :ys/Organization_property_179,
   :sh/or           :ys/list_180,
   :sh/path         :schema/ownedBy,
   :ys/fromProperty #{:wdt/P749 :wdt/P127}})

(def PerformingGroup_property_188
  {:db/ident        :ys/PerformingGroup_property_188,
   :sh/node         :schema/Person,
   :sh/path         :yago/director,
   :ys/fromProperty #{:wdt/P1037 :wdt/P1875}})

(def PerformingGroup_property_189
  {:db/ident        :ys/PerformingGroup_property_189,
   :sh/node         :schema/Language,
   :sh/path         :schema/knowsLanguage,
   :ys/fromProperty :wdt/P1412})

(def PerformingGroup_property_190
  {:db/ident        :ys/PerformingGroup_property_190,
   :sh/node         :schema/CreativeWork,
   :sh/path         :yago/notableWork,
   :ys/fromProperty :wdt/P800})

(def Person_property_193
  {:db/ident        :ys/Person_property_193,
   :sh/node         :yago/BeliefSystem,
   :sh/path         :yago/beliefSystem,
   :ys/fromProperty #{:wdt/P1142 :wdt/P140}})

(def Person_property_194
  {:db/ident        :ys/Person_property_194,
   :sh/node         :yago/Award,
   :sh/path         :yago/academicDegree,
   :ys/fromProperty :wdt/P512})

(def Person_property_195
  {:db/ident        :ys/Person_property_195,
   :sh/node         :schema/Organization,
   :sh/path         :schema/affiliation,
   :ys/fromProperty :wdt/P1416})

(def Person_property_196
  {:db/ident        :ys/Person_property_196,
   :sh/node         :schema/Organization,
   :sh/path         :schema/worksFor,
   :ys/fromProperty :wdt/P108})

(def Person_property_197
  {:db/ident        :ys/Person_property_197,
   :sh/node         :schema/Organization,
   :sh/path         :schema/alumniOf,
   :ys/fromProperty :wdt/P69})

(def Person_property_198
  {:db/ident        :ys/Person_property_198,
   :sh/node         :yago/Award,
   :sh/path         :schema/award,
   :ys/fromProperty :wdt/P166})

(def Person_property_199
  {:db/ident        :ys/Person_property_199,
   :sh/maxCount     1,
   :sh/or           :ys/list_200,
   :sh/path         :schema/birthDate,
   :ys/fromProperty :wdt/P569})

(def Person_property_209
  {:db/ident        :ys/Person_property_209,
   :sh/maxCount     1,
   :sh/node         :schema/Place,
   :sh/path         :schema/birthPlace,
   :ys/fromProperty :wdt/P19})

(def Person_property_210
  {:db/ident        :ys/Person_property_210,
   :sh/node         :schema/Person,
   :sh/path         :schema/children,
   :ys/fromProperty :wdt/P40})

(def Person_property_211
  {:db/ident        :ys/Person_property_211,
   :sh/maxCount     1,
   :sh/or           :ys/list_212,
   :sh/path         :schema/deathDate,
   :ys/fromProperty :wdt/P570})

(def Person_property_221
  {:db/ident        :ys/Person_property_221,
   :sh/maxCount     1,
   :sh/node         :schema/Place,
   :sh/path         :schema/deathPlace,
   :ys/fromProperty :wdt/P20})

(def Person_property_222
  {:db/ident        :ys/Person_property_222,
   :sh/maxCount     1,
   :sh/node         :yago/Gender,
   :sh/path         :schema/gender,
   :ys/fromProperty :wdt/P21})

(def Person_property_223
  {:db/ident        :ys/Person_property_223,
   :sh/node         :schema/Place,
   :sh/path         :schema/homeLocation,
   :ys/fromProperty :wdt/P551})

(def Person_property_224
  {:db/ident        :ys/Person_property_224,
   :sh/node         :schema/Language,
   :sh/path         :schema/knowsLanguage,
   :ys/fromProperty :wdt/P1412})

(def Person_property_225
  {:db/ident        :ys/Person_property_225,
   :sh/node         :schema/Organization,
   :sh/path         :schema/memberOf,
   :ys/fromProperty #{:wdt/P463 :wdt/P102 :wdt/P54}})

(def Person_property_226
  {:db/ident        :ys/Person_property_226,
   :sh/node         :schema/Country,
   :sh/path         :schema/nationality,
   :ys/fromProperty :wdt/P27})

(def Person_property_227
  {:db/ident        :ys/Person_property_227,
   :sh/node         :schema/Thing,
   :sh/path         :schema/owns,
   :ys/fromProperty :wdt/P1830})

(def Person_property_228
  {:db/ident        :ys/Person_property_228,
   :sh/node         :schema/Person,
   :sh/path         :schema/spouse,
   :ys/fromProperty :wdt/P26})

(def Place_property_236
  {:db/ident        :ys/Place_property_236,
   :sh/node         :schema/Place,
   :sh/path         :schema/location,
   :ys/fromProperty #{:wdt/P4552 :wdt/P706 :wdt/P131 :wdt/P17 :wdt/P276}})

(def Place_property_237
  {:db/ident        :ys/Place_property_237,
   :sh/datatype     :xsd/decimal,
   :sh/path         :schema/area,
   :ys/fromProperty :wdt/P2046})

(def Place_property_238
  {:db/ident        :ys/Place_property_238,
   :sh/node         :schema/Place,
   :sh/path         :schema/highestPoint,
   :ys/fromProperty :wdt/P610})

(def Place_property_239
  {:db/ident        :ys/Place_property_239,
   :sh/node         :schema/Place,
   :sh/path         :schema/lowestPoint,
   :ys/fromProperty :wdt/P1589})

(def Place_property_240
  {:db/ident        :ys/Place_property_240,
   :sh/node         :schema/Place,
   :sh/path         :schema/neighbors,
   :ys/fromProperty #{:wdt/P47 :wdt/P206}})

(def Place_property_241
  {:db/ident        :ys/Place_property_241,
   :sh/datatype     :xsd/decimal,
   :sh/path         :schema/elevation,
   :ys/fromProperty :wdt/P2044})

(def Place_property_242
  {:db/ident        :ys/Place_property_242,
   :sh/datatype     :geo/wktLiteral,
   :sh/maxCount     1,
   :sh/path         :schema/geo,
   :ys/fromProperty :wdt/P625})

(def Politician_property_235
  {:db/ident        :ys/Politician_property_235,
   :sh/node         :schema/Event,
   :sh/path         :yago/candidateIn,
   :ys/fromProperty :wdt/P3602})

(def Product_property_274
  {:db/ident        :ys/Product_property_274,
   :sh/node         :yago/Award,
   :sh/path         :schema/award,
   :ys/fromProperty :wdt/P166})

(def Product_property_275
  {:db/ident        :ys/Product_property_275,
   :sh/node         :schema/Product,
   :sh/path         :schema/material,
   :ys/fromProperty :wdt/P186})

(def Product_property_276
  {:db/ident        :ys/Product_property_276,
   :sh/node         :schema/Corporation,
   :sh/path         :schema/manufacturer,
   :ys/fromProperty #{:wdt/P176 :wdt/P178}})

(def Product_property_277
  {:db/ident        :ys/Product_property_277,
   :sh/maxCount     1,
   :sh/or           :ys/list_278,
   :sh/path         :schema/dateCreated,
   :ys/fromProperty :wdt/P577})

(def Product_property_287
  {:db/ident        :ys/Product_property_287,
   :sh/datatype     :xsd/string,
   :sh/path         :schema/gtin,
   :sh/pattern      "^\\d{12,14}|\\d{8}$",
   :ys/fromProperty :wdt/P3962})

(def SportsPerson_property_233
  {:db/ident        :ys/SportsPerson_property_233,
   :sh/datatype     :xsd/string,
   :sh/path         :yago/sportNumber,
   :ys/fromProperty :wdt/P1618})

(def SportsPerson_property_234
  {:db/ident        :ys/SportsPerson_property_234,
   :sh/node         :schema/Event,
   :sh/path         :yago/playsIn,
   :ys/fromProperty :wdt/P118})

(def TVSeries_property_61
  {:db/ident        :ys/TVSeries_property_61,
   :sh/or           :ys/list_62,
   :sh/path         :schema/musicBy,
   :ys/fromProperty :wdt/P86})

(def TVSeries_property_67
  {:db/ident        :ys/TVSeries_property_67,
   :sh/node         :schema/Person,
   :sh/path         :schema/actor,
   :ys/fromProperty :wdt/P161})

(def TVSeries_property_68
  {:db/ident        :ys/TVSeries_property_68,
   :sh/node         :schema/Place,
   :sh/path         :schema/locationCreated,
   :ys/fromProperty :wdt/P495})

(def TVSeries_property_69
  {:db/ident        :ys/TVSeries_property_69,
   :sh/node         :schema/Person,
   :sh/path         :schema/director,
   :ys/fromProperty :wdt/P57})

(def TVSeries_property_70
  {:db/ident        :ys/TVSeries_property_70,
   :sh/datatype     :xsd/decimal,
   :sh/maxCount     1,
   :sh/path         :schema/numberOfEpisodes,
   :ys/fromProperty :wdt/P1113})

(def TVSeries_property_71
  {:db/ident        :ys/TVSeries_property_71,
   :sh/datatype     :xsd/decimal,
   :sh/maxCount     1,
   :sh/path         :schema/numberOfSeasons,
   :ys/fromProperty :wdt/P2437})

(def TVSeries_property_72
  {:db/ident        :ys/TVSeries_property_72,
   :sh/node         :schema/Organization,
   :sh/path         :schema/productionCompany,
   :ys/fromProperty :wdt/P272})

(def Taxon_property_288
  {:db/ident        :ys/Taxon_property_288,
   :sh/node         :schema/Taxon,
   :sh/path         :schema/parentTaxon,
   :ys/fromProperty :wdt/P171})

(def Taxon_property_289
  {:db/ident        :ys/Taxon_property_289,
   :sh/node         :schema/Taxon,
   :sh/path         :yago/consumes,
   :ys/fromProperty :wdt/P1034})

(def Thing_property_1
  {:db/ident        :ys/Thing_property_1,
   :sh/datatype     :xsd/anyURI,
   :sh/path         :schema/image,
   :ys/fromProperty :wdt/P18})

(def Thing_property_2
  {:db/ident        :ys/Thing_property_2,
   :sh/datatype     :rdf/langString,
   :sh/path         :schema/alternateName,
   :ys/fromProperty #{:skos/altLabel :wdt/|1843| :wdt/P225}})

(def Thing_property_3
  {:db/ident        :ys/Thing_property_3,
   :sh/datatype     :rdf/langString,
   :sh/path         :rdfs/comment,
   :sh/uniqueLang   true,
   :ys/fromProperty :schema/description})

(def Thing_property_4
  {:db/ident        :ys/Thing_property_4,
   :sh/datatype     :rdf/langString,
   :sh/path         :rdfs/label,
   :sh/uniqueLang   true,
   :ys/fromProperty :schema/name})

(def Thing_property_5
  {:db/ident    :ys/Thing_property_5,
   :sh/datatype :xsd/anyURI,
   :sh/path     :schema/mainEntityOfPage})

(def Thing_property_6
  {:db/ident        :ys/Thing_property_6,
   :sh/datatype     :xsd/anyURI,
   :sh/path         :schema/url,
   :ys/fromProperty :wdt/P856})

(def Thing_property_7
  {:db/ident        :ys/Thing_property_7,
   :sh/datatype     :xsd/string,
   :sh/path         :schema/sameAs,
   :ys/fromProperty #{:wdt/P345 :wdt/P1053 :wdt/P646 :wdt/P2671}})

(def Way_property_270
  {:db/ident        :ys/Way_property_270,
   :sh/node         :schema/Place,
   :sh/path         :yago/terminus,
   :ys/fromProperty :wdt/P609})

(def Way_property_271
  {:db/ident        :ys/Way_property_271,
   :sh/datatype     :xsd/decimal,
   :sh/maxCount     1,
   :sh/path         :yago/length,
   :ys/fromProperty :wdt/P2043})

(def element_101
  {:db/ident :ys/element_101,
   :sh/node  :schema/Organization})

(def element_103
  {:db/ident :ys/element_103,
   :sh/node  :schema/Person})

(def element_109
  {:db/ident :ys/element_109,
   :sh/node  :schema/Person})

(def element_111
  {:db/ident :ys/element_111,
   :sh/node  :schema/Organization})

(def element_115
  {:db/ident    :ys/element_115,
   :sh/datatype :xsd/dateTime})

(def element_117
  {:db/ident    :ys/element_117,
   :sh/datatype :xsd/date})

(def element_119
  {:db/ident    :ys/element_119,
   :sh/datatype :xsd/gYearMonth})

(def element_121
  {:db/ident    :ys/element_121,
   :sh/datatype :xsd/gYear})

(def element_125
  {:db/ident    :ys/element_125,
   :sh/datatype :xsd/dateTime})

(def element_127
  {:db/ident    :ys/element_127,
   :sh/datatype :xsd/date})

(def element_129
  {:db/ident    :ys/element_129,
   :sh/datatype :xsd/gYearMonth})

(def element_131
  {:db/ident    :ys/element_131,
   :sh/datatype :xsd/gYear})

(def element_135
  {:db/ident :ys/element_135,
   :sh/node  :schema/Organization})

(def element_137
  {:db/ident :ys/element_137,
   :sh/node  :schema/Person})

(def element_142
  {:db/ident :ys/element_142,
   :sh/node  :schema/Organization})

(def element_144
  {:db/ident :ys/element_144,
   :sh/node  :schema/Person})

(def element_15
  {:db/ident :ys/element_15,
   :sh/node  :schema/Organization})

(def element_153
  {:db/ident    :ys/element_153,
   :sh/datatype :xsd/dateTime})

(def element_155
  {:db/ident    :ys/element_155,
   :sh/datatype :xsd/date})

(def element_157
  {:db/ident    :ys/element_157,
   :sh/datatype :xsd/gYearMonth})

(def element_159
  {:db/ident    :ys/element_159,
   :sh/datatype :xsd/gYear})

(def element_168
  {:db/ident    :ys/element_168,
   :sh/datatype :xsd/dateTime})

(def element_17
  {:db/ident :ys/element_17,
   :sh/node  :schema/Person})

(def element_170
  {:db/ident    :ys/element_170,
   :sh/datatype :xsd/date})

(def element_172
  {:db/ident    :ys/element_172,
   :sh/datatype :xsd/gYearMonth})

(def element_174
  {:db/ident    :ys/element_174,
   :sh/datatype :xsd/gYear})

(def element_181
  {:db/ident :ys/element_181,
   :sh/node  :schema/Organization})

(def element_183
  {:db/ident :ys/element_183,
   :sh/node  :schema/Person})

(def element_201
  {:db/ident    :ys/element_201,
   :sh/datatype :xsd/dateTime})

(def element_203
  {:db/ident    :ys/element_203,
   :sh/datatype :xsd/date})

(def element_205
  {:db/ident    :ys/element_205,
   :sh/datatype :xsd/gYearMonth})

(def element_207
  {:db/ident    :ys/element_207,
   :sh/datatype :xsd/gYear})

(def element_213
  {:db/ident    :ys/element_213,
   :sh/datatype :xsd/dateTime})

(def element_215
  {:db/ident    :ys/element_215,
   :sh/datatype :xsd/date})

(def element_217
  {:db/ident    :ys/element_217,
   :sh/datatype :xsd/gYearMonth})

(def element_219
  {:db/ident    :ys/element_219,
   :sh/datatype :xsd/gYear})

(def element_23
  {:db/ident :ys/element_23,
   :sh/node  :schema/Organization})

(def element_25
  {:db/ident :ys/element_25,
   :sh/node  :schema/Person})

(def element_265
  {:db/ident :ys/element_265,
   :sh/node  :schema/Organization})

(def element_267
  {:db/ident :ys/element_267,
   :sh/node  :schema/Person})

(def element_279
  {:db/ident    :ys/element_279,
   :sh/datatype :xsd/dateTime})

(def element_281
  {:db/ident    :ys/element_281,
   :sh/datatype :xsd/date})

(def element_283
  {:db/ident    :ys/element_283,
   :sh/datatype :xsd/gYearMonth})

(def element_285
  {:db/ident    :ys/element_285,
   :sh/datatype :xsd/gYear})

(def element_291
  {:db/ident    :ys/element_291,
   :sh/datatype :xsd/dateTime})

(def element_293
  {:db/ident    :ys/element_293,
   :sh/datatype :xsd/date})

(def element_295
  {:db/ident    :ys/element_295,
   :sh/datatype :xsd/gYearMonth})

(def element_297
  {:db/ident    :ys/element_297,
   :sh/datatype :xsd/gYear})

(def element_30
  {:db/ident    :ys/element_30,
   :sh/datatype :xsd/dateTime})

(def element_300
  {:db/ident    :ys/element_300,
   :sh/datatype :xsd/dateTime})

(def element_302
  {:db/ident    :ys/element_302,
   :sh/datatype :xsd/date})

(def element_304
  {:db/ident    :ys/element_304,
   :sh/datatype :xsd/gYearMonth})

(def element_306
  {:db/ident    :ys/element_306,
   :sh/datatype :xsd/gYear})

(def element_32
  {:db/ident    :ys/element_32,
   :sh/datatype :xsd/date})

(def element_34
  {:db/ident    :ys/element_34,
   :sh/datatype :xsd/gYearMonth})

(def element_36
  {:db/ident    :ys/element_36,
   :sh/datatype :xsd/gYear})

(def element_44
  {:db/ident :ys/element_44,
   :sh/node  :schema/Organization})

(def element_46
  {:db/ident :ys/element_46,
   :sh/node  :schema/Person})

(def element_51
  {:db/ident :ys/element_51,
   :sh/node  :schema/Organization})

(def element_53
  {:db/ident :ys/element_53,
   :sh/node  :schema/Person})

(def element_57
  {:db/ident :ys/element_57,
   :sh/node  :schema/Organization})

(def element_59
  {:db/ident :ys/element_59,
   :sh/node  :schema/Person})

(def element_63
  {:db/ident :ys/element_63,
   :sh/node  :schema/MusicGroup})

(def element_65
  {:db/ident :ys/element_65,
   :sh/node  :schema/Person})

(def element_75
  {:db/ident :ys/element_75,
   :sh/node  :schema/Person})

(def element_77
  {:db/ident :ys/element_77,
   :sh/node  :schema/MusicGroup})

(def element_82
  {:db/ident :ys/element_82,
   :sh/node  :schema/Person})

(def element_84
  {:db/ident :ys/element_84,
   :sh/node  :schema/MusicGroup})

(def element_90
  {:db/ident :ys/element_90,
   :sh/node  :schema/MusicGroup})

(def element_92
  {:db/ident :ys/element_92,
   :sh/node  :schema/Person})

(def endDateAnnotation
  {:db/ident        :ys/endDateAnnotation,
   :rdf/type        :ys/AnnotationPropertyShape,
   :sh/maxCount     1,
   :sh/or           :ys/list_299,
   :sh/path         :schema/endDate,
   :ys/fromProperty :wpq/P582})

(def startDateAnnotation
  {:db/ident        :ys/startDateAnnotation,
   :rdf/type        :ys/AnnotationPropertyShape,
   :sh/maxCount     1,
   :sh/or           :ys/list_290,
   :sh/path         :schema/startDate,
   :ys/fromProperty :wpq/P580})