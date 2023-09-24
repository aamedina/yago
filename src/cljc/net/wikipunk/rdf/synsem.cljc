(ns net.wikipunk.rdf.synsem
  ^{:base       "http://www.w3.org/ns/lemon/synsem#",
    :namespaces {"cc" "http://creativecommons.org/ns#",
                 "dc11" "http://purl.org/dc/elements/1.1/",
                 "foaf" "http://xmlns.com/foaf/0.1/",
                 "ontolex" "http://www.w3.org/ns/lemon/ontolex#",
                 "owl" "http://www.w3.org/2002/07/owl#",
                 "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                 "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                 "semiotics"
                 "http://www.ontologydesignpatterns.org/cp/owl/semiotics.owl#",
                 "synsem" "http://www.w3.org/ns/lemon/synsem#",
                 "vann" "http://purl.org/vocab/vann/",
                 "vs" "http://www.w3.org/2003/06/sw-vocab-status/ns#",
                 "xsd" "http://www.w3.org/2001/XMLSchema#"},
    :prefix     "synsem",
    :source     "http://www.w3.org/ns/lemon/synsem#"}
  {:cc/licence {:xsd/anyURI
                "https://creativecommons.org/publicdomain/zero/1.0/"},
   :cc/license {:xsd/anyURI
                "https://creativecommons.org/publicdomain/zero/1.0/"},
   :dc11/contributor
   #{{:xsd/anyURI "https://sites.google.com/site/francescafrontini/"}
     {:xsd/anyURI "http://art.uniroma2.it/fiorelli/"}
     {:xsd/anyURI "http://art.uniroma2.it/stellato/"}
     {:xsd/anyURI "http://www.paulbuitelaar.net/"}
     {:xsd/anyURI "http://jogracia.url.ph/web/"}
     {:xsd/anyURI "http://www.istc.cnr.it/people/aldo-gangemi"}
     {:xsd/anyURI "http://www.oeg-upm.net/index.php/teachers/53-lupe"}
     {:xsd/anyURI "http://www.dfki.de/~declerck/"}
     {:xsd/anyURI "http://www.ilc.cnr.it/en/content/anas-fahad-khan"}
     {:xsd/anyURI
      "http://mayor2.dia.fi.upm.es/oeg-upm/index.php/en/teachers/52-emontiel"}},
   :dc11/creator #{{:xsd/anyURI "http://www.cimiano.de/"}
                   {:xsd/anyURI "http://john.mccr.ae/"}},
   :dc11/description
   {:rdf/language "en",
    :rdf/value
    "A model for the representation of lexical information relative to ontologies. Syntax and semantics module."},
   :dc11/issued {:rdf/type  :xsd/date,
                 :rdf/value "2016-01-10"},
   :dc11/modified {:rdf/type  :xsd/date,
                   :rdf/value "2016-01-10"},
   :dc11/publisher {:xsd/anyURI "http://www.w3.org/community/ontolex"},
   :dc11/rights "CC-Zero",
   :dc11/title {:rdf/language "en",
                :rdf/value    "Lexicon Model for Ontologies - Synsem"},
   :owl/imports {:xsd/anyURI "http://www.w3.org/ns/lemon/ontolex"},
   :owl/versionInfo 1.1M,
   :rdf/type #{:owl/Ontology :voaf/Vocabulary},
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "-Version 1.0: depreciation with minor change in metadata for LOV publication\n-Version 1.1: creation"},
   :vann/preferredNamespacePrefix "synsem",
   :vann/preferredNamespaceUri "http://www.w3.org/ns/lemon/synsem#",
   :xsd/anyURI "http://www.w3.org/ns/lemon/synsem"})

(def OntoMap
  {:db/ident :synsem/OntoMap,
   :rdf/type :owl/Class,
   :rdfs/comment
   #{{:rdf/language "ru",
      :rdf/value
      "'Отображение онтологии' (OntoMap для краткости) определяет, как синтаксический фрейм и его синтаксические аргументы сопоставляются с набором понятий и свойств в онтологии, которые вместе определяют значение синтаксического фрейма."}
     {:rdf/language "en",
      :rdf/value
      "An 'ontology mapping' (OntoMap for short) specifies how a syntactic frame and its syntactic arguments map to a set of concepts and properties in the ontology that together specify the meaning of the syntactic frame."}},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/lemon/synsem"},
   :rdfs/label #{{:rdf/language "ru",
                  :rdf/value    "отображение онтологии"}
                 {:rdf/language "es",
                  :rdf/value    "applicación de l'ontología"}
                 {:rdf/language "en",
                  :rdf/value    "ontology mapping"}
                 {:rdf/language "nl",
                  :rdf/value    "ontologieafbeelding"}
                 {:rdf/language "fr",
                  :rdf/value    "application de l'ontologie"}
                 {:rdf/language "de",
                  :rdf/value    "Ontologieabbildung"}
                 {:rdf/language "it",
                  :rdf/value    "mappa de l'ontologia"}},
   :vs/term_status "stable"})

(def SyntacticArgument
  {:db/ident :synsem/SyntacticArgument,
   :rdf/type :owl/Class,
   :rdfs/comment
   #{{:rdf/language "en",
      :rdf/value
      "A 'syntactic argument' represents a slot that needs to be filled for a certain syntactic frame to be complete. Syntactic arguments typically realize a certain grammatical function (e.g. subject, direct object, indirect object, prepositional object, etc.)."}
     {:rdf/language "ru",
      :rdf/value
      "'Синтаксический аргумент' представляет собой слот, который необходимо заполнить для получения определенного синтаксического фрейма. Синтаксические аргументы обычно реализуют определенную грамматическую функцию (например, субъект, прямой объект, косвенный объект, предпозиционный объект и т.д.)."}},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/lemon/synsem"},
   :rdfs/label #{{:rdf/language "it",
                  :rdf/value    "argomento sintattico"}
                 {:rdf/language "fr",
                  :rdf/value    "actant syntaxique"}
                 {:rdf/language "pt",
                  :rdf/value    "argumento sintatico"}
                 {:rdf/language "nl",
                  :rdf/value    "syntactisch argument"}
                 {:rdf/language "ro",
                  :rdf/value    "argument sintactic"}
                 {:rdf/language "en",
                  :rdf/value    "Syntactic Argument"}
                 {:rdf/language "af",
                  :rdf/value    "sintaktiese argument"}
                 {:rdf/language "sv",
                  :rdf/value    "syntaktiskt argument"}
                 {:rdf/language "es",
                  :rdf/value    "argumento sintáctico"}
                 {:rdf/language "de",
                  :rdf/value    "syntaktisches Argument"}
                 {:rdf/language "ru",
                  :rdf/value    "синтаксический аргумент"}},
   :vs/term_status "stable"})

(def SyntacticFrame
  {:db/ident :synsem/SyntacticFrame,
   :rdf/type :owl/Class,
   :rdfs/comment
   #{{:rdf/language "ru",
      :rdf/value
      "'Синтаксический фрейм' представляет синтаксическое поведение открытого слова класса в терминах (синтаксических) аргументов, которые ему необходимы. Он по существу описывает так называемую структуру подкатегоризации рассматриваемого слова, в частности синтаксические аргументы, которые он требует."}
     {:rdf/language "en",
      :rdf/value
      "A 'syntactic frame' represents the syntactic behavior of an open class word in terms of the (syntactic) arguments it requires. It essentially describes the so called subcategorization structure of the word in question, in particular the syntactic arguments it requires."}},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/lemon/synsem"},
   :rdfs/label #{{:rdf/language "de",
                  :rdf/value    "syntaktisches Frame"}
                 {:rdf/language "it",
                  :rdf/value    "frame"}
                 {:rdf/language "sv",
                  :rdf/value    "ram"}
                 {:rdf/language "af",
                  :rdf/value    "raam"}
                 {:rdf/language "en",
                  :rdf/value    "Syntactic Frame"}
                 {:rdf/language "es",
                  :rdf/value    "marco sintáctico"}
                 {:rdf/language "fr",
                  :rdf/value    "cadre syntaxique"}
                 {:rdf/language "ro",
                  :rdf/value    "cadru"}
                 {:rdf/language "ru",
                  :rdf/value    "синтаксический фрейм"}
                 {:rdf/language "nl",
                  :rdf/value    "raam"}},
   :vs/term_status "stable"})

(def condition
  {:db/ident :synsem/condition,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #{{:rdf/language "en",
      :rdf/value
      "The 'condition' property defines an evaluable constraint that derives from using a certain lexical entry to express a given ontological predicate."}
     {:rdf/language "ru",
      :rdf/value
      "Свойство 'состояние' определяет оценочное ограничение, которое получается из использования определенной словарной единицы для выражения заданного онтологического предиката."}},
   :rdfs/domain :synsem/OntoMap,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/lemon/synsem"},
   :rdfs/label #{{:rdf/language "sv",
                  :rdf/value    "villkor"}
                 {:rdf/language "pt",
                  :rdf/value    "condição"}
                 {:rdf/language "es",
                  :rdf/value    "condición"}
                 {:rdf/language "it",
                  :rdf/value    "condizione"}
                 {:rdf/language "de",
                  :rdf/value    "Bedingung"}
                 {:rdf/language "en",
                  :rdf/value    "condition"}
                 {:rdf/language "ru",
                  :rdf/value    "состояние"}
                 {:rdf/language "nl",
                  :rdf/value    "voorwaarde"}
                 {:rdf/language "af",
                  :rdf/value    "voorwaarde"}
                 {:rdf/language "fr",
                  :rdf/value    "condition"}
                 {:rdf/language "ro",
                  :rdf/value    "condiție"}},
   :rdfs/subPropertyOf :ontolex/usage,
   :vs/term_status "stable"})

(def isA
  {:db/ident :synsem/isA,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #{{:rdf/language "ru",
      :rdf/value
      "Свойство 'экземпляр' представляет одиночный аргумент класса или унарный предикат."}
     {:rdf/language "en",
      :rdf/value
      "The 'is a' property represents the single argument of a class or unary  predicate."}},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/lemon/synsem"},
   :rdfs/label #{{:rdf/language "ru",
                  :rdf/value    "экземпляр"}
                 {:rdf/language "af",
                  :rdf/value    "instansie van"}
                 {:rdf/language "pt",
                  :rdf/value    "é um"}
                 {:rdf/language "it",
                  :rdf/value    "istanza di"}
                 {:rdf/language "fr",
                  :rdf/value    "Instance de"}
                 {:rdf/language "ro",
                  :rdf/value    "instanță a"}
                 {:rdf/language "nl",
                  :rdf/value    "instantie van"}
                 {:rdf/language "sv",
                  :rdf/value    "är en"}
                 {:rdf/language "de",
                  :rdf/value    "instanz von"}
                 {:rdf/language "es",
                  :rdf/value    "Instancia de"}},
   :rdfs/subPropertyOf :synsem/ontoCorrespondence,
   :vs/term_status "stable"})

(def marker
  {:db/ident :synsem/marker,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #{{:rdf/language "en",
      :rdf/value
      "The 'marker' property indicates the marker of a syntactic argument; this can be a case marker or some other lexical entry such as a preposition or particle."}
     {:rdf/language "ru",
      :rdf/value
      "Свойство 'маркер' указывает маркер синтаксического аргумента; Это может быть маркер падежа или какая-то другая словарная единица, такая как предлог или частица."}},
   :rdfs/domain :synsem/SyntacticArgument,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/lemon/synsem"},
   :rdfs/label #{{:rdf/language "en",
                  :rdf/value    "marker"}
                 {:rdf/language "es",
                  :rdf/value    "marcador"}
                 {:rdf/language "ru",
                  :rdf/value    "маркер"}
                 {:rdf/language "de",
                  :rdf/value    "Marker"}
                 {:rdf/language "af",
                  :rdf/value    "merker"}
                 {:rdf/language "ro",
                  :rdf/value    "marcator"}
                 {:rdf/language "pt",
                  :rdf/value    "marcado"}
                 {:rdf/language "fr",
                  :rdf/value    "marqueur"}
                 {:rdf/language "sv",
                  :rdf/value    "markör"}
                 {:rdf/language "it",
                  :rdf/value    "marcatore"}
                 {:rdf/language "nl",
                  :rdf/value    "merker"}},
   :rdfs/subPropertyOf :owl/topObjectProperty,
   :vs/term_status "stable"})

(def objOfProp
  {:db/ident :synsem/objOfProp,
   :owl/propertyChainAxiom [:synsem/ontoMapping :synsem/objOfProp],
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #{{:rdf/language "en",
      :rdf/value
      "The 'objOfProp' represents the 2nd argument or object of a binary predicate (property) in the ontology."}
     {:rdf/language "ru",
      :rdf/value
      "'Объект свойства' представляет 2-й аргумент или объект бинарного предиката (свойства) в онтологии."}},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/lemon/synsem"},
   :rdfs/label #{{:rdf/language "fr",
                  :rdf/value    "complément de la propriété"}
                 {:rdf/language "en",
                  :rdf/value    "object of property"}
                 {:rdf/language "nl",
                  :rdf/value    "object van predikaat"}
                 {:rdf/language "it",
                  :rdf/value    "oggetto della proprietà"}
                 {:rdf/language "ru",
                  :rdf/value    "объект свойства"}
                 {:rdf/language "af",
                  :rdf/value    "voorwerp van predikaat"}
                 {:rdf/language "es",
                  :rdf/value    "complemento de la propiedad"}
                 {:rdf/language "ro",
                  :rdf/value    "obiect al proprietății"}
                 {:rdf/language "sv",
                  :rdf/value    "objekt av predikat"}
                 {:rdf/language "de",
                  :rdf/value    "objekt des Prädikats"}},
   :rdfs/subPropertyOf #{:synsem/ontoCorrespondence :owl/topObjectProperty},
   :vs/term_status "stable"})

(def ontoCorrespondence
  {:db/ident :synsem/ontoCorrespondence,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #{{:rdf/language "en",
      :rdf/value
      "The 'ontoCorrespondence' property binds an argument of a predicate defined in the ontology to a syntactic argument that realizes this predicate argument syntactically."}
     {:rdf/language "ru",
      :rdf/value
      "Свойство 'онтологическая переписка' связывает аргумент предиката, определенного в онтологии, с синтаксическим аргументом, который синтаксически реализует этот предикат."}},
   :rdfs/domain {:owl/unionOf [:ontolex/LexicalSense :synsem/OntoMap],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/lemon/synsem"},
   :rdfs/label #{{:rdf/language "ru",
                  :rdf/value    "онтологическая переписка"}
                 {:rdf/language "de",
                  :rdf/value    "ontologische Korrespondenz"}
                 {:rdf/language "nl",
                  :rdf/value    "ontologische correspondentie"}
                 {:rdf/language "en",
                  :rdf/value    "ontological correspondence"}
                 {:rdf/language "es",
                  :rdf/value    "correspondencia ontológica"}
                 {:rdf/language "it",
                  :rdf/value    "corrispondenza ontologica"}
                 {:rdf/language "fr",
                  :rdf/value    "correspondance ontologique"}},
   :rdfs/range :synsem/SyntacticArgument,
   :rdfs/subPropertyOf :owl/topObjectProperty,
   :vs/term_status "stable"})

(def ontoMapping
  {:db/ident :synsem/ontoMapping,
   :rdf/type #{:owl/ObjectProperty :owl/InverseFunctionalProperty
               :owl/FunctionalProperty},
   :rdfs/comment
   #{{:rdf/language "ru",
      :rdf/value
      "Свойство 'onMapping' связывает отображение онтологии с соответствующим ему лексическим смыслом."}
     {:rdf/language "en",
      :rdf/value
      "The 'ontoMapping'  property relates an ontology mapping to its corresponding lexical sense."}},
   :rdfs/domain :synsem/OntoMap,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/lemon/synsem"},
   :rdfs/label #{{:rdf/language "ru",
                  :rdf/value    "отображение онтологии"}
                 {:rdf/language "es",
                  :rdf/value    "applicación de l'ontología"}
                 {:rdf/language "nl",
                  :rdf/value    "ontologieafbeelding"}
                 {:rdf/language "fr",
                  :rdf/value    "application de l'ontologie"}
                 {:rdf/language "de",
                  :rdf/value    "Ontologieabbildung"}
                 {:rdf/language "it",
                  :rdf/value    "mappa de l'ontologia"}},
   :rdfs/range :ontolex/LexicalSense,
   :vs/term_status "stable"})

(def optional
  {:db/ident :synsem/optional,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #{{:rdf/language "en",
      :rdf/value
      "The 'optional' property indicates whether a syntactic argument is optional, that is, it can be syntactically omitted."}
     {:rdf/language "ru",
      :rdf/value
      "Свойство 'опциональный' указывает, является ли синтаксический аргумент необязательным, то есть его можно синтаксически исключить."}},
   :rdfs/domain :synsem/SyntacticArgument,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/lemon/synsem"},
   :rdfs/label #{{:rdf/language "nl",
                  :rdf/value    "optioneel"}
                 {:rdf/language "fr",
                  :rdf/value    "optionnel"}
                 {:rdf/language "en",
                  :rdf/value    "optional"}
                 {:rdf/language "de",
                  :rdf/value    "optional"}
                 {:rdf/language "pt",
                  :rdf/value    "opcional"}
                 {:rdf/language "af",
                  :rdf/value    "opsioneel"}
                 {:rdf/language "ro",
                  :rdf/value    "facultativ"}
                 {:rdf/language "sv",
                  :rdf/value    "optionell"}
                 {:rdf/language "es",
                  :rdf/value    "opcional"}
                 {:rdf/language "ru",
                  :rdf/value    "опциональный"}
                 {:rdf/language "it",
                  :rdf/value    "opzionale"}},
   :rdfs/range :xsd/boolean,
   :rdfs/subPropertyOf :owl/topDataProperty,
   :vs/term_status "stable"})

(def propertyDomain
  {:db/ident :synsem/propertyDomain,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #{{:rdf/language "ru",
      :rdf/value
      "'Свойство домена' обеспечивает прагматическое ограничение на область свойства, на которое ссылается этот смысл."}
     {:rdf/language "en",
      :rdf/value
      "'Property domain' provides a pragmatic restriction on the domain of the property referred to by this sense."}},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/lemon/synsem"},
   :rdfs/label #{{:rdf/language "ru",
                  :rdf/value    "свойство домена"}
                 {:rdf/language "fr",
                  :rdf/value    "ensemble de la propriété"}
                 {:rdf/language "nl",
                  :rdf/value    "domein van predikaat"}
                 {:rdf/language "de",
                  :rdf/value    "Definitionsbereich des Prädikats"}
                 {:rdf/language "ro",
                  :rdf/value    "domeniul proprietății"}
                 {:rdf/language "af",
                  :rdf/value    "predikaatdefinisiegebied"}
                 {:rdf/language "es",
                  :rdf/value    "dominio de la propiedad"}
                 {:rdf/language "en",
                  :rdf/value    "property domain"}
                 {:rdf/language "sv",
                  :rdf/value    "relationsdomän"}
                 {:rdf/language "it",
                  :rdf/value    "dominio di proprietà"}},
   :rdfs/subPropertyOf :synsem/condition,
   :vs/term_status "stable"})

(def propertyRange
  {:db/ident :synsem/propertyRange,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #{{:rdf/language "en",
      :rdf/value
      "'Property domain' provides a pragmatic restriction on the range of the property referred to by this sense."}
     {:rdf/language "ru",
      :rdf/value
      "'Диапазон свойства' обеспечивает прагматическое ограничение на область диапазона,на которое ссылается этот смысл."}},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/lemon/synsem"},
   :rdfs/label #{{:rdf/language "sv",
                  :rdf/value    "relationsräckvidd"}
                 {:rdf/language "ro",
                  :rdf/value    "gama proprietății"}
                 {:rdf/language "it",
                  :rdf/value    "codominio di proprietà"}
                 {:rdf/language "nl",
                  :rdf/value    "bereik van predikaat"}
                 {:rdf/language "af",
                  :rdf/value    "predikaatwaardegebied"}
                 {:rdf/language "en",
                  :rdf/value    "property range"}
                 {:rdf/language "fr",
                  :rdf/value    "image de la propriété"}
                 {:rdf/language "es",
                  :rdf/value    "rango de la propiedad"}
                 {:rdf/language "de",
                  :rdf/value    "Wertemenge des Prädikats"}
                 {:rdf/language "ru",
                  :rdf/value    "диапазон свойства"}},
   :rdfs/subPropertyOf :synsem/condition,
   :vs/term_status "stable"})

(def subjOfProp
  {:db/ident :synsem/subjOfProp,
   :owl/propertyChainAxiom [:synsem/ontoMapping :synsem/subjOfProp],
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #{{:rdf/language "en",
      :rdf/value
      "The 'subjOfProp' property represents the 1st argument or subject of a binary predicate (property) in the ontology."}
     {:rdf/language "ru",
      :rdf/value
      "Свойство 'subjOfProp' представляет 1-й аргумент или субъект бинарного предиката (свойства) в онтологии."}},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/lemon/synsem"},
   :rdfs/label #{{:rdf/language "fr",
                  :rdf/value    "sujet de la propriété"}
                 {:rdf/language "it",
                  :rdf/value    "soggetto della proprietà"}
                 {:rdf/language "ru",
                  :rdf/value    "субъект свойства"}
                 {:rdf/language "af",
                  :rdf/value    "onderwerp van predikaat"}
                 {:rdf/language "en",
                  :rdf/value    "subject of property"}
                 {:rdf/language "es",
                  :rdf/value    "sujeto de la propiedad"}
                 {:rdf/language "ro",
                  :rdf/value    "subiectul proprietații"}
                 {:rdf/language "de",
                  :rdf/value    "Subjekt des Prädikats"}
                 {:rdf/language "nl",
                  :rdf/value    "onderwerp van predikaat"}
                 {:rdf/language "sv",
                  :rdf/value    "subjekt av predikat"}},
   :rdfs/subPropertyOf :synsem/ontoCorrespondence,
   :vs/term_status "stable"})

(def submap
  {:db/ident :synsem/submap,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #{{:rdf/language "ru",
      :rdf/value
      "Свойство 'submap' связывает (сложное) онтологическое отображение с набором привязок, которые вместе связывают аргументы задействованных предикатов с набором синтаксических аргументов, которые реализуют их синтаксически."}
     {:rdf/language "en",
      :rdf/value
      "The 'submap' property relates a (complex) ontological mapping to a set of bindings that together bind the arguments of the involved predicates to a set of syntactic arguments that realize them syntactically."}},
   :rdfs/domain :synsem/OntoMap,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/lemon/synsem"},
   :rdfs/label #{{:rdf/language "es",
                  :rdf/value    "parte del marco"}
                 {:rdf/language "sv",
                  :rdf/value    "underbetydelse"}
                 {:rdf/language "it",
                  :rdf/value    "subframe"}
                 {:rdf/language "nl",
                  :rdf/value    "deelraam"}
                 {:rdf/language "en",
                  :rdf/value    "submap"}
                 {:rdf/language "de",
                  :rdf/value    "Subframe"}
                 {:rdf/language "fr",
                  :rdf/value    "cadre composante"}},
   :rdfs/range :synsem/OntoMap,
   :rdfs/subPropertyOf :owl/topObjectProperty,
   :vs/term_status "stable"})

(def synArg
  {:db/ident :synsem/synArg,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #{{:rdf/language "en",
      :rdf/value
      "The object property synArg relates a syntactic frame to one of its syntactic arguments."}
     {:rdf/language "ru",
      :rdf/value
      "Свойство объекта 'synArg' связывает синтаксический фрейм с одним из его синтаксических аргументов."}},
   :rdfs/domain :synsem/SyntacticFrame,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/lemon/synsem"},
   :rdfs/label #{{:rdf/language "en",
                  :rdf/value    "syntactic argument"}
                 {:rdf/language "it",
                  :rdf/value    "argomento sintattico"}
                 {:rdf/language "fr",
                  :rdf/value    "actant syntaxique"}
                 {:rdf/language "pt",
                  :rdf/value    "argumento sintatico"}
                 {:rdf/language "nl",
                  :rdf/value    "syntactisch argument"}
                 {:rdf/language "ro",
                  :rdf/value    "argument sintactic"}
                 {:rdf/language "af",
                  :rdf/value    "sintaktiese argument"}
                 {:rdf/language "sv",
                  :rdf/value    "syntaktiskt argument"}
                 {:rdf/language "es",
                  :rdf/value    "argumento sintáctico"}
                 {:rdf/language "de",
                  :rdf/value    "syntaktisches Argument"}
                 {:rdf/language "ru",
                  :rdf/value    "синтаксический аргумент"}},
   :rdfs/range :synsem/SyntacticArgument,
   :rdfs/subPropertyOf :owl/topObjectProperty,
   :vs/term_status "stable"})

(def synBehavior
  {:db/ident :synsem/synBehavior,
   :rdf/type #{:owl/ObjectProperty :owl/InverseFunctionalProperty},
   :rdfs/comment
   #{{:rdf/language "ru",
      :rdf/value
      "Свойство 'синтаксическое поведение' связывает лексическую запись с одним из ее синтаксических типов поведения, захваченных синтаксическим фреймом."}
     {:rdf/language "en",
      :rdf/value
      "The 'syntactic behavior' property relates a lexical entry to one of its syntactic behaviors as captured by a syntactic frame."}},
   :rdfs/domain :ontolex/LexicalEntry,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/lemon/synsem"},
   :rdfs/label #{{:rdf/language "pt",
                  :rdf/value    "comportamento sintatico"}
                 {:rdf/language "de",
                  :rdf/value    "syntaktisches Verhalten"}
                 {:rdf/language "nl",
                  :rdf/value    "syntactisch optreden"}
                 {:rdf/language "ro",
                  :rdf/value    "comportament sintactic"}
                 {:rdf/language "fr",
                  :rdf/value    "conduite syntaxique"}
                 {:rdf/language "it",
                  :rdf/value    "comportamento sintattico"}
                 {:rdf/language "en",
                  :rdf/value    "syntactic behavior"}
                 {:rdf/language "sv",
                  :rdf/value    "syntaktiskt beteende"}
                 {:rdf/language "es",
                  :rdf/value    "funcionamiento sintáctico"}
                 {:rdf/language "ru",
                  :rdf/value    "синтаксическое поведение"}
                 {:rdf/language "af",
                  :rdf/value    "sintaktiese dedrag"}},
   :rdfs/range :synsem/SyntacticFrame,
   :rdfs/subPropertyOf :owl/topObjectProperty,
   :vs/term_status "stable"})

(def urn:uuid:b82c3c99-e3e9-5416-aa96-4601ccc44b83
  {:cc/licence {:xsd/anyURI
                "https://creativecommons.org/publicdomain/zero/1.0/"},
   :cc/license {:xsd/anyURI
                "https://creativecommons.org/publicdomain/zero/1.0/"},
   :dc11/contributor
   #{{:xsd/anyURI "https://sites.google.com/site/francescafrontini/"}
     {:xsd/anyURI "http://art.uniroma2.it/fiorelli/"}
     {:xsd/anyURI "http://art.uniroma2.it/stellato/"}
     {:xsd/anyURI "http://www.paulbuitelaar.net/"}
     {:xsd/anyURI "http://jogracia.url.ph/web/"}
     {:xsd/anyURI "http://www.istc.cnr.it/people/aldo-gangemi"}
     {:xsd/anyURI "http://www.oeg-upm.net/index.php/teachers/53-lupe"}
     {:xsd/anyURI "http://www.dfki.de/~declerck/"}
     {:xsd/anyURI "http://www.ilc.cnr.it/en/content/anas-fahad-khan"}
     {:xsd/anyURI
      "http://mayor2.dia.fi.upm.es/oeg-upm/index.php/en/teachers/52-emontiel"}},
   :dc11/creator #{{:xsd/anyURI "http://www.cimiano.de/"}
                   {:xsd/anyURI "http://john.mccr.ae/"}},
   :dc11/description
   {:rdf/language "en",
    :rdf/value
    "A model for the representation of lexical information relative to ontologies. Syntax and semantics module."},
   :dc11/issued {:rdf/type  :xsd/date,
                 :rdf/value "2016-01-10"},
   :dc11/modified {:rdf/type  :xsd/date,
                   :rdf/value "2016-01-10"},
   :dc11/publisher {:xsd/anyURI "http://www.w3.org/community/ontolex"},
   :dc11/rights "CC-Zero",
   :dc11/title {:rdf/language "en",
                :rdf/value    "Lexicon Model for Ontologies - Synsem"},
   :owl/imports {:xsd/anyURI "http://www.w3.org/ns/lemon/ontolex"},
   :owl/versionInfo 1.1M,
   :rdf/type #{:owl/Ontology :voaf/Vocabulary},
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "-Version 1.0: depreciation with minor change in metadata for LOV publication\n-Version 1.1: creation"},
   :vann/preferredNamespacePrefix "synsem",
   :vann/preferredNamespaceUri "http://www.w3.org/ns/lemon/synsem#",
   :xsd/anyURI "http://www.w3.org/ns/lemon/synsem"})