(ns net.wikipunk.rdf.ontolex
  ^{:base       "http://www.w3.org/ns/lemon/ontolex#",
    :namespaces {"cc" "http://creativecommons.org/ns#",
                 "dc11" "http://purl.org/dc/elements/1.1/",
                 "foaf" "http://xmlns.com/foaf/0.1/",
                 "ontolex" "http://www.w3.org/ns/lemon/ontolex#",
                 "owl" "http://www.w3.org/2002/07/owl#",
                 "owl2xml" "http://www.w3.org/2006/12/owl2-xml#",
                 "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                 "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                 "semiotics"
                 "http://www.ontologydesignpatterns.org/cp/owl/semiotics.owl#",
                 "vann" "http://purl.org/vocab/vann/",
                 "vs" "http://www.w3.org/2003/06/sw-vocab-status/ns#",
                 "xsd" "http://www.w3.org/2001/XMLSchema#"},
    :prefix     "ontolex",
    :source     "http://www.w3.org/ns/lemon/ontolex#"}
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
    "A model for the representation of lexical information relative to ontologies. Core module."},
   :dc11/issued {:rdf/type  :xsd/date,
                 :rdf/value "2016-01-10"},
   :dc11/modified {:rdf/type  :xsd/date,
                   :rdf/value "2016-01-10"},
   :dc11/publisher {:xsd/anyURI "http://www.w3.org/community/ontolex"},
   :dc11/rights "CC-Zero",
   :dc11/title {:rdf/language "en",
                :rdf/value    "Lexicon Model for Ontologies - Core"},
   :owl/versionInfo 1.1M,
   :rdf/type #{:owl/Ontology :voaf/Vocabulary},
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "-Version 1.0: depreciation with minor change in metadata for LOV publication\n-Version 1.1: creation"},
   :vann/preferredNamespacePrefix "ontolex",
   :vann/preferredNamespaceUri "http://www.w3.org/ns/lemon/ontolex#",
   :xsd/anyURI "http://www.w3.org/ns/lemon/ontolex"})

(def Affix
  {:db/ident :ontolex/Affix,
   :rdf/type :owl/Class,
   :rdfs/comment
   #{{:rdf/language "en",
      :rdf/value
      "An affix is a lexical entry that represents a morpheme (suffix, prefix, infix, circumfix) that is attached to a word stem to form a new word."}
     {:rdf/language "ru",
      :rdf/value
      "'Аффикс' - это словарная единица, которая представляет морфему (суффикс, префикс, инфикс, циркумфикс), добавляемую к основе слова для образования нового слова."}},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/lemon/ontolex"},
   :rdfs/label #{{:rdf/language "nl",
                  :rdf/value    "affix"}
                 {:rdf/language "ru",
                  :rdf/value    "аффикс"}
                 {:rdf/language "fr",
                  :rdf/value    "affixe"}
                 {:rdf/language "es",
                  :rdf/value    "afijo"}
                 {:rdf/language "af",
                  :rdf/value    "affiks"}
                 {:rdf/language "ro",
                  :rdf/value    "aplică"}
                 {:rdf/language "en",
                  :rdf/value    "affix"}
                 {:rdf/language "de",
                  :rdf/value    "Affix"}
                 {:rdf/language "it",
                  :rdf/value    "affisso"}
                 {:rdf/language "sv",
                  :rdf/value    "affix"}},
   :rdfs/subClassOf :ontolex/LexicalEntry,
   :vs/term_status "stable"})

(def ConceptSet
  {:db/ident :ontolex/ConceptSet,
   :owl/equivalentClass {:owl/minQualifiedCardinality 1,
                         :owl/onClass    :ontolex/LexicalConcept,
                         :owl/onProperty :skos/inScheme,
                         :rdf/type       :owl/Restriction},
   :rdf/type :owl/Class,
   :rdfs/comment
   #{{:rdf/language "en",
      :rdf/value "A concept set represents a collection of lexical concepts."}
     {:rdf/language "ru",
      :rdf/value
      "'Набор понятий' представляет собой совокупность лексических понятий."}},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/lemon/ontolex"},
   :rdfs/label #{{:rdf/language "nl",
                  :rdf/value    "verzameling van begrippen"}
                 {:rdf/language "es",
                  :rdf/value    "conjunto de conceptos"}
                 {:rdf/language "de",
                  :rdf/value    "Konzeptsatz"}
                 {:rdf/language "fr",
                  :rdf/value    "banque de conepts"}
                 {:rdf/language "ru",
                  :rdf/value    "набор понятий"}
                 {:rdf/language "it",
                  :rdf/value    "banca concetti"}
                 {:rdf/language "en",
                  :rdf/value    "concept set"}},
   :rdfs/subClassOf :skos/ConceptScheme,
   :vs/term_status "stable"})

(def Form
  {:db/ident :ontolex/Form,
   :rdf/type :owl/Class,
   :rdfs/comment
   #{{:rdf/language "en",
      :rdf/value
      "A form represents one grammatical realization of a lexical entry."}
     {:rdf/language "ru",
      :rdf/value
      "'Форма' представляет одну грамматическую реализацию словарной единицы."}},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/lemon/ontolex"},
   :rdfs/label #{{:rdf/language "de",
                  :rdf/value    "Form"}
                 {:rdf/language "ru",
                  :rdf/value    "форма"}
                 {:rdf/language "en",
                  :rdf/value    "form"}
                 {:rdf/language "es",
                  :rdf/value    "forma"}
                 {:rdf/language "pt",
                  :rdf/value    "Forma"}
                 {:rdf/language "af",
                  :rdf/value    "vorm"}
                 {:rdf/language "nl",
                  :rdf/value    "vorm"}
                 {:rdf/language "it",
                  :rdf/value    "forma"}
                 {:rdf/language "ro",
                  :rdf/value    "formă"}
                 {:rdf/language "sv",
                  :rdf/value    "form"}
                 {:rdf/language "fr",
                  :rdf/value    "forme"}},
   :rdfs/subClassOf #{:owl/Thing
                      {:owl/minQualifiedCardinality 1,
                       :owl/onDataRange :rdf/langString,
                       :owl/onProperty  :ontolex/writtenRep,
                       :rdf/type        :owl/Restriction}},
   :vs/term_status "stable"})

(def LexicalConcept
  {:db/ident :ontolex/LexicalConcept,
   :rdf/type :owl/Class,
   :rdfs/comment
   #{{:rdf/language "en",
      :rdf/value
      "A lexical concept represents a mental abstraction, concept or unit of thought that embodies the meaning of one or more lexical entries."}
     {:rdf/language "ru",
      :rdf/value
      "'Лексическое понятие' представляет элемент абстрактного мышления, понятие или единицу мысли, которая может быть лексикализована определенным набором смыслов."}},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/lemon/ontolex"},
   :rdfs/label #{{:rdf/language "fr",
                  :rdf/value    "concept lexical"}
                 {:rdf/language "sv",
                  :rdf/value    "lexikaliskt begrepp"}
                 {:rdf/language "es",
                  :rdf/value    "concepto lexicalizado"}
                 {:rdf/language "ro",
                  :rdf/value    "concept lexical"}
                 {:rdf/language "it",
                  :rdf/value    "concetto lessicale"}
                 {:rdf/language "ru",
                  :rdf/value    "лексическое понятие"}
                 {:rdf/language "en",
                  :rdf/value    "lexical concept"}
                 {:rdf/language "de",
                  :rdf/value    "lexikalisches Konzept"}
                 {:rdf/language "af",
                  :rdf/value    "leksikale konsep"}
                 {:rdf/language "pt",
                  :rdf/value    "conceito léxico"}
                 {:rdf/language "nl",
                  :rdf/value    "lexikaal concept"}},
   :rdfs/subClassOf #{:semiotics/Meaning :skos/Concept},
   :vs/term_status "stable"})

(def LexicalEntry
  {:db/ident :ontolex/LexicalEntry,
   :rdf/type :owl/Class,
   :rdfs/comment
   #{{:rdf/language "ru",
      :rdf/value
      "'Словарная единица' представляет собой единицу анализа словаря, которая состоит из совокупности грамматически связанных форм и совокупности основных значений, ассоциирующихся со всеми этими формами. 'Словарная единица' - это слово, словосочетание или аффикс одной части речи, морфологической модели, этимологии и набора значений."}
     {:rdf/language "en",
      :rdf/value
      "A lexical entry represents a unit of analysis of the lexicon that consists of a set of forms that are grammatically related and a set of base meanings that are associated with all of these forms. Thus, a lexical entry is a word, multiword expression or affix with a single part-of-speech, morphological pattern, etymology and set of senses."}},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/lemon/ontolex"},
   :rdfs/label #{{:rdf/language "es",
                  :rdf/value    "entrada léxica"}
                 {:rdf/language "it",
                  :rdf/value    "entrata lessicale"}
                 {:rdf/language "af",
                  :rdf/value    "leksikale inskrywing"}
                 {:rdf/language "sv",
                  :rdf/value    "lexikoningång"}
                 {:rdf/language "nl",
                  :rdf/value    "lexikaal item"}
                 {:rdf/language "ro",
                  :rdf/value    "înregistrare lexicală"}
                 {:rdf/language "fr",
                  :rdf/value    "entrée lexicale"}
                 {:rdf/language "ru",
                  :rdf/value    "словарная единица"}
                 {:rdf/language "de",
                  :rdf/value    "Lexikoneintrag"}
                 {:rdf/language "en",
                  :rdf/value    "lexical entry"}},
   :rdfs/subClassOf #{{:owl/maxQualifiedCardinality 1,
                       :owl/onClass    :ontolex/Form,
                       :owl/onProperty :ontolex/canonicalForm,
                       :rdf/type       :owl/Restriction} :owl/Thing
                      {:owl/minQualifiedCardinality 1,
                       :owl/onClass    :ontolex/Form,
                       :owl/onProperty :ontolex/lexicalForm,
                       :rdf/type       :owl/Restriction} :semiotics/Expression},
   :vs/term_status "stable"})

(def LexicalSense
  {:db/ident :ontolex/LexicalSense,
   :rdf/type :owl/Class,
   :rdfs/comment
   #{{:rdf/language "en",
      :rdf/value
      "A lexical sense represents the lexical meaning of a lexical entry when interpreted as referring to the corresponding ontology element. A lexical sense thus represents a reification of a pair of a uniquely determined lexical entry and a uniquely determined ontology entity it refers to. A link between a lexical entry and an ontology entity via a Lexical Sense object implies that the lexical entry can be used to refer to the ontology entity in question."}
     {:rdf/language "ru",
      :rdf/value
      "'Лексический смысл' обозначает лексическое значение словарной единицы, когда оно понимается как относящееся к соответствующему элементу онтологии. 'Лексический смысл' представляет собой овеществление пары, состоящей из однозначно определяемой словарной единицы и однозначно определяемой сущности отнологии, к которой относится данный лексический смысл. Связь между словарной единицей и сущностью в онтологии посредством объекта 'Лексический Смысл' подразумевает, что словарная статья может быть использована для отсылки к соответствующей сущности в онтологии."}},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/lemon/ontolex"},
   :rdfs/label #{{:rdf/language "sv",
                  :rdf/value    "lexikonbetydelse"}
                 {:rdf/language "ro",
                  :rdf/value    "sens lexical"}
                 {:rdf/language "ru",
                  :rdf/value    "лексический смысл"}
                 {:rdf/language "nl",
                  :rdf/value    "lexikaal zin"}
                 {:rdf/language "de",
                  :rdf/value    "lexikalischer Sinn"}
                 {:rdf/language "es",
                  :rdf/value    "acepción léxica"}
                 {:rdf/language "af",
                  :rdf/value    "leksikale sin"}
                 {:rdf/language "en",
                  :rdf/value    "lexical sense"}
                 {:rdf/language "fr",
                  :rdf/value    "signification lexicale"}
                 {:rdf/language "it",
                  :rdf/value    "senso lessicale"}},
   :rdfs/subClassOf #{:semiotics/Meaning
                      {:owl/onClass    :ontolex/LexicalEntry,
                       :owl/onProperty :ontolex/isSenseOf,
                       :owl/qualifiedCardinality 1,
                       :rdf/type       :owl/Restriction}
                      {:owl/cardinality 1,
                       :owl/onProperty  :ontolex/reference,
                       :rdf/type        :owl/Restriction}},
   :vs/term_status "stable"})

(def MultiWordExpression
  {:db/ident :ontolex/MultiWordExpression,
   :rdf/type :owl/Class,
   :rdfs/comment
   #{{:rdf/language "en",
      :rdf/value
      "A multiword expression is a lexical entry that consists of two or more words."}
     {:rdf/language "ru",
      :rdf/value
      "'Словосочетание' - это словарная единица, состоящая из двух или более слов."}},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/lemon/ontolex"},
   :rdfs/label #{{:rdf/language "ro",
                  :rdf/value    "expresie din mai multe cuvinte"}
                 {:rdf/language "af",
                  :rdf/value    "multiwoorduitdrukking"}
                 {:rdf/language "es",
                  :rdf/value    "expresión multipalabra"}
                 {:rdf/language "fr",
                  :rdf/value    "expression à mots multiples"}
                 {:rdf/language "sv",
                  :rdf/value    "flerordsuttryck"}
                 {:rdf/language "ru",
                  :rdf/value    "словосочетание"}
                 {:rdf/language "de",
                  :rdf/value    "Mehrwortausdruck"}
                 {:rdf/language "nl",
                  :rdf/value    "mutliwoorduitdrukking"}
                 {:rdf/language "it",
                  :rdf/value    "espressione di gruppi di parole"}
                 {:rdf/language "en",
                  :rdf/value    "multi-word expression"}},
   :rdfs/subClassOf :ontolex/LexicalEntry,
   :vs/term_status "stable"})

(def Word
  {:db/ident :ontolex/Word,
   :rdf/type :owl/Class,
   :rdfs/comment
   #{{:rdf/language "en",
      :rdf/value "A word is a lexical entry that consists of a single token."}
     {:rdf/language "ru",
      :rdf/value
      "'Слово' - это словарная единица, представяющая собой единичную реализацию лексемы."}},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/lemon/ontolex"},
   :rdfs/label #{{:rdf/language "es",
                  :rdf/value    "palabra"}
                 {:rdf/language "ro",
                  :rdf/value    "cuvânt"}
                 {:rdf/language "it",
                  :rdf/value    "parola"}
                 {:rdf/language "af",
                  :rdf/value    "woord"}
                 {:rdf/language "sv",
                  :rdf/value    "ord"}
                 {:rdf/language "fr",
                  :rdf/value    "mot"}
                 {:rdf/language "ru",
                  :rdf/value    "слово"}
                 {:rdf/language "de",
                  :rdf/value    "Wort"}
                 {:rdf/language "en",
                  :rdf/value    "word"}
                 {:rdf/language "nl",
                  :rdf/value    "woord"}},
   :rdfs/subClassOf :ontolex/LexicalEntry,
   :vs/term_status "stable"})

(def canonicalForm
  {:db/ident :ontolex/canonicalForm,
   :rdf/type #{:owl/ObjectProperty :owl/FunctionalProperty},
   :rdfs/comment
   #{{:rdf/language "ru",
      :rdf/value
      "Свойство 'каноническая форма' связывает словарную единицу с ее канонической или словарной формой. Она обычно обозначает \"лемму\" словарной единицы."}
     {:rdf/language "en",
      :rdf/value
      "The 'canonical form' property relates a lexical entry to its canoncical or dictionary form. This usually indicates the \"lemma\" form of a lexical entry. "}},
   :rdfs/domain :ontolex/LexicalEntry,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/lemon/ontolex"},
   :rdfs/label #{{:rdf/language "nl",
                  :rdf/value    "canonieke vorm"}
                 {:rdf/language "af",
                  :rdf/value    "kanoniese vorm"}
                 {:rdf/language "en",
                  :rdf/value    "canonical form"}
                 {:rdf/language "ru",
                  :rdf/value    "каноническая форма"}
                 {:rdf/language "de",
                  :rdf/value    "kanonische Form"}
                 {:rdf/language "sv",
                  :rdf/value    "kanonisk form "}
                 {:rdf/language "ro",
                  :rdf/value    "formă canonică"}
                 {:rdf/language "pt",
                  :rdf/value    "forma canonica"}
                 {:rdf/language "it",
                  :rdf/value    "forma canonica"}
                 {:rdf/language "es",
                  :rdf/value    "forma canónica"}
                 {:rdf/language "fr",
                  :rdf/value    "forme canonique"}},
   :rdfs/range :ontolex/Form,
   :rdfs/subPropertyOf :ontolex/lexicalForm,
   :vs/term_status "stable"})

(def concept
  {:db/ident :ontolex/concept,
   :owl/inverseOf :ontolex/isConceptOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #{{:rdf/language "en",
      :rdf/value
      "The 'concept' property relates an ontological entity to a lexical concept that represents the corresponding meaning."}
     {:rdf/language "ru",
      :rdf/value
      "Свойство 'понятие' связывает сущность в онтологии с лексическим понятием, которое представляет соответствующее значение."}},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/lemon/ontolex"},
   :rdfs/label #{{:rdf/language "sv",
                  :rdf/value    "begrepp"}
                 {:rdf/language "en",
                  :rdf/value    "concept"}
                 {:rdf/language "ru",
                  :rdf/value    "понятие"}
                 {:rdf/language "ro",
                  :rdf/value    "concept"}
                 {:rdf/language "nl",
                  :rdf/value    "begrip"}
                 {:rdf/language "pt",
                  :rdf/value    "conceito"}
                 {:rdf/language "de",
                  :rdf/value    "Konzept"}
                 {:rdf/language "af",
                  :rdf/value    "konsep"}
                 {:rdf/language "it",
                  :rdf/value    "concetto"}
                 {:rdf/language "es",
                  :rdf/value    "concepto"}
                 {:rdf/language "fr",
                  :rdf/value    "concept"}},
   :rdfs/range :ontolex/LexicalConcept,
   :vs/term_status "stable"})

(def denotes
  {:db/ident :ontolex/denotes,
   :owl/propertyChainAxiom [:ontolex/sense :ontolex/reference],
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #{{:rdf/language "ru",
      :rdf/value
      "Свойство 'обозначает' связывает словарную единицу с предикатом в онтологии, который представляет ее значение и обладает денотативной или теоретико-модельной семантикой."}
     {:rdf/language "en",
      :rdf/value
      "The 'denotes' property relates a lexical entry to a predicate in a given ontology that represents its meaning and has some denotational or model-theoretic semantics. "}},
   :rdfs/domain :ontolex/LexicalEntry,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/lemon/ontolex"},
   :rdfs/label #{{:rdf/language "pt",
                  :rdf/value    "denota"}
                 {:rdf/language "es",
                  :rdf/value    "denota"}
                 {:rdf/language "it",
                  :rdf/value    "denota"}
                 {:rdf/language "nl",
                  :rdf/value    "duidet aan"}
                 {:rdf/language "ru",
                  :rdf/value    "обозначает"}
                 {:rdf/language "ro",
                  :rdf/value    "denotă"}
                 {:rdf/language "af",
                  :rdf/value    "dui aan"}
                 {:rdf/language "sv",
                  :rdf/value    "betecknar"}
                 {:rdf/language "de",
                  :rdf/value    "bezeichnet"}
                 {:rdf/language "en",
                  :rdf/value    "denotes"}
                 {:rdf/language "fr",
                  :rdf/value    "dénote"}},
   :rdfs/range :rdfs/Resource,
   :rdfs/subPropertyOf :semiotics/denotes,
   :vs/term_status "stable"})

(def evokes
  {:db/ident :ontolex/evokes,
   :owl/propertyChainAxiom [:ontolex/sense :ontolex/isLexicalizedSenseOf],
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #{{:rdf/language "en",
      :rdf/value
      "The 'evokes' property relates a lexical entry to one of the lexical concepts it evokes, i.e. the mental concept that speakers of a language might associate when hearing the lexical entry."}
     {:rdf/language "ru",
      :rdf/value
      "Свойство 'порождает' связывает словарную единицу с одним из лексических понятий, которую она порождает, то есть мыслительное понятие, которое возникает в сознании говорящих, когда они слышат данную словарную единицу."}},
   :rdfs/domain :ontolex/LexicalEntry,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/lemon/ontolex"},
   :rdfs/label #{{:rdf/language "ro",
                  :rdf/value    "evocă"}
                 {:rdf/language "sv",
                  :rdf/value    "framkallar"}
                 {:rdf/language "ru",
                  :rdf/value    "порождает"}
                 {:rdf/language "pt",
                  :rdf/value    "evoca"}
                 {:rdf/language "nl",
                  :rdf/value    "lokt uit"}
                 {:rdf/language "en",
                  :rdf/value    "evokes"}
                 {:rdf/language "af",
                  :rdf/value    "roep op"}
                 {:rdf/language "de",
                  :rdf/value    "ruft hervor"}
                 {:rdf/language "es",
                  :rdf/value    "evoca"}
                 {:rdf/language "fr",
                  :rdf/value    "évoque"}
                 {:rdf/language "it",
                  :rdf/value    "evoca"}},
   :rdfs/range :ontolex/LexicalConcept,
   :vs/term_status "stable"})

(def isConceptOf
  {:db/ident :ontolex/isConceptOf,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #{{:rdf/language "ru",
      :rdf/value
      "Это свойство формализует значение 'Лексического Понятия', связывая его с отдельным значением в онтологии."}
     {:rdf/language "en",
      :rdf/value
      "This property formalizes the meaning of a Lexical Concept by linking it to a particular ontological meaning."}},
   :rdfs/domain :ontolex/LexicalConcept,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/lemon/ontolex"},
   :rdfs/label #{{:rdf/language "en",
                  :rdf/value    "is concept of"}
                 {:rdf/language "nl",
                  :rdf/value    "is concept van"}
                 {:rdf/language "it",
                  :rdf/value    "è concetto di "}
                 {:rdf/language "de",
                  :rdf/value    "ist Konzept von"}
                 {:rdf/language "ro",
                  :rdf/value    "este concept a(l)"}
                 {:rdf/language "pt",
                  :rdf/value    "é conceito de"}
                 {:rdf/language "af",
                  :rdf/value    "is konsep van"}
                 {:rdf/language "sv",
                  :rdf/value    "är begrepp för"}
                 {:rdf/language "ru",
                  :rdf/value    "является понятием"}
                 {:rdf/language "fr",
                  :rdf/value    "est un concept pour "}
                 {:rdf/language "es",
                  :rdf/value    "es concepto de"}},
   :vs/term_status "stable"})

(def isDenotedBy
  {:db/ident :ontolex/isDenotedBy,
   :owl/inverseOf :ontolex/denotes,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #{{:rdf/language "en",
      :rdf/value
      "The object property isDenotedBy is the inverse of the object property denotes."}
     {:rdf/language "ru",
      :rdf/value
      "Свойство объекта 'обозначается' является обратным к свойству объекта 'обозначает'."}},
   :rdfs/domain :rdfs/Resource,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/lemon/ontolex"},
   :rdfs/label #{{:rdf/language "en",
                  :rdf/value    "is denoted by"}
                 {:rdf/language "ro",
                  :rdf/value    "este denotat cu"}
                 {:rdf/language "it",
                  :rdf/value    "è denotato da"}
                 {:rdf/language "ru",
                  :rdf/value    "обозначается"}
                 {:rdf/language "sv",
                  :rdf/value    "betecknas av"}
                 {:rdf/language "pt",
                  :rdf/value    "é denotado por"}
                 {:rdf/language "nl",
                  :rdf/value    "wordt aangeduidet door"}
                 {:rdf/language "de",
                  :rdf/value    "wird bezeichnet von"}
                 {:rdf/language "fr",
                  :rdf/value    "est dénoté par"}
                 {:rdf/language "es",
                  :rdf/value    "es denotado por"}
                 {:rdf/language "af",
                  :rdf/value    "word aangedui deur"}},
   :rdfs/range :ontolex/LexicalEntry,
   :vs/term_status "stable"})

(def isEvokedBy
  {:db/ident         :ontolex/isEvokedBy,
   :owl/inverseOf    :ontolex/evokes,
   :rdf/type         :owl/ObjectProperty,
   :rdfs/comment     #{{:rdf/language "ru",
                        :rdf/value    "Отношение обратное к 'порождает'."}
                       {:rdf/language "en",
                        :rdf/value    "The inverse relation to evokes."}},
   :rdfs/domain      :ontolex/LexicalConcept,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/lemon/ontolex"},
   :rdfs/label       #{{:rdf/language "ro",
                        :rdf/value    "este evocat de"}
                       {:rdf/language "fr",
                        :rdf/value    "est évoqué par"}
                       {:rdf/language "es",
                        :rdf/value    "es evocado por"}
                       {:rdf/language "af",
                        :rdf/value    "word opgeroep deur"}
                       {:rdf/language "it",
                        :rdf/value    "è evocato da"}
                       {:rdf/language "sv",
                        :rdf/value    "framkallas av "}
                       {:rdf/language "de",
                        :rdf/value    "wird hervorgerufen von"}
                       {:rdf/language "ru",
                        :rdf/value    "порождается"}
                       {:rdf/language "nl",
                        :rdf/value    "wordt uitgelokt door"}
                       {:rdf/language "en",
                        :rdf/value    "is evoked by"}},
   :rdfs/range       :ontolex/LexicalEntry,
   :vs/term_status   "stable"})

(def isLexicalizedSenseOf
  {:db/ident :ontolex/isLexicalizedSenseOf,
   :owl/inverseOf :ontolex/lexicalizedSense,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #{{:rdf/language "ru",
      :rdf/value
      "Свойство объекта 'является лексикализованным смыслом' представляет собой свойство, обратное к свойству 'лексикализованный смысл'."}
     {:rdf/language "en",
      :rdf/value
      "The object property isLexicalizedSenseOf is the inverse property of lexicalized sense."}},
   :rdfs/domain :ontolex/LexicalSense,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/lemon/ontolex"},
   :rdfs/label #{{:rdf/language "fr",
                  :rdf/value    "est le sens lexicalisé de"}
                 {:rdf/language "sv",
                  :rdf/value    "är lexikaliserad betydelse för"}
                 {:rdf/language "en",
                  :rdf/value    "is lexicalized sense of"}
                 {:rdf/language "es",
                  :rdf/value    "es l'acepción lexicalizado de"}
                 {:rdf/language "ru",
                  :rdf/value    "является лексикализованным смыслом"}
                 {:rdf/language "ro",
                  :rdf/value    "este sens lexicalizat de"}
                 {:rdf/language "nl",
                  :rdf/value    "is lexikaal zin van"}
                 {:rdf/language "de",
                  :rdf/value    "ist lexikalisierter Sinn von"}
                 {:rdf/language "it",
                  :rdf/value    "è il senso lessicalizzato di"}
                 {:rdf/language "af",
                  :rdf/value    "is geleksikaliseerde sin van"}},
   :rdfs/range :ontolex/LexicalConcept,
   :vs/term_status "stable"})

(def isReferenceOf
  {:db/ident :ontolex/isReferenceOf,
   :owl/inverseOf :ontolex/reference,
   :rdf/type #{:owl/ObjectProperty :owl/InverseFunctionalProperty},
   :rdfs/comment
   #{{:rdf/language "en",
      :rdf/value
      "The object property isReferenceOf is the inverse property of reference."}
     {:rdf/language "ru",
      :rdf/value
      "Свойство объекта 'является референцией' представляет собой свойство, обратное к свойству 'референция'."}},
   :rdfs/domain :rdfs/Resource,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/lemon/ontolex"},
   :rdfs/label #{{:rdf/language "fr",
                  :rdf/value    "est référence de"}
                 {:rdf/language "it",
                  :rdf/value    "è riferimento di"}
                 {:rdf/language "nl",
                  :rdf/value    "is referentie van"}
                 {:rdf/language "ru",
                  :rdf/value    "является референцией"}
                 {:rdf/language "de",
                  :rdf/value    "ist Referenz von"}
                 {:rdf/language "en",
                  :rdf/value    "is reference of"}
                 {:rdf/language "af",
                  :rdf/value    "is verwysing van"}
                 {:rdf/language "ro",
                  :rdf/value    "este referință a(l)"}
                 {:rdf/language "pt",
                  :rdf/value    "é referência de"}
                 {:rdf/language "sv",
                  :rdf/value    "är referens för"}
                 {:rdf/language "es",
                  :rdf/value    "es referencia de"}},
   :rdfs/range {:owl/unionOf [:ontolex/LexicalSense :synsem/OntoMap],
                :rdf/type    :owl/Class},
   :vs/term_status "stable"})

(def isSenseOf
  {:db/ident :ontolex/isSenseOf,
   :rdf/type #{:owl/ObjectProperty :owl/FunctionalProperty},
   :rdfs/comment
   #{{:rdf/language "en",
      :rdf/value    "The property isSenseOf is the inverse property of sense."}
     {:rdf/language "ru",
      :rdf/value
      "Свойство 'является смыслом' представляет собой свойство, обратное к свойству 'смысл'."}},
   :rdfs/domain :ontolex/LexicalSense,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/lemon/ontolex"},
   :rdfs/label #{{:rdf/language "it",
                  :rdf/value    "è il senso di"}
                 {:rdf/language "ru",
                  :rdf/value    "является смыслом"}
                 {:rdf/language "pt",
                  :rdf/value    "é sentido de"}
                 {:rdf/language "es",
                  :rdf/value    "es acepción de"}
                 {:rdf/language "en",
                  :rdf/value    "is sense of"}
                 {:rdf/language "nl",
                  :rdf/value    "is zin van"}
                 {:rdf/language "sv",
                  :rdf/value    "är betydelse för"}
                 {:rdf/language "fr",
                  :rdf/value    "est signification de"}
                 {:rdf/language "ro",
                  :rdf/value    "este sens a(l)"}
                 {:rdf/language "af",
                  :rdf/value    "is sin van"}
                 {:rdf/language "de",
                  :rdf/value    "ist Sinn von"}},
   :rdfs/range :ontolex/LexicalEntry,
   :vs/term_status "stable"})

(def lexicalForm
  {:db/ident :ontolex/lexicalForm,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #{{:rdf/language "ru",
      :rdf/value
      "Свойство 'лексическая форма' соотносит словарную единицу с одним вариантом грамматической формы словарной единицы."}
     {:rdf/language "en",
      :rdf/value
      "The 'lexical form' property relates a lexical entry to one grammatical form variant of the lexical entry."}},
   :rdfs/domain :ontolex/LexicalEntry,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/lemon/ontolex"},
   :rdfs/label #{{:rdf/language "es",
                  :rdf/value    "forma léxica"}
                 {:rdf/language "af",
                  :rdf/value    "leksikale vorm"}
                 {:rdf/language "de",
                  :rdf/value    "lexikalische Form"}
                 {:rdf/language "fr",
                  :rdf/value    "forme lexicale"}
                 {:rdf/language "it",
                  :rdf/value    "forma lessicale"}
                 {:rdf/language "sv",
                  :rdf/value    "lexikonform"}
                 {:rdf/language "ro",
                  :rdf/value    "formă lexicală"}
                 {:rdf/language "en",
                  :rdf/value    "lexical form"}
                 {:rdf/language "ru",
                  :rdf/value    "лексическая форма"}
                 {:rdf/language "nl",
                  :rdf/value    "lexikaal vorm"}},
   :rdfs/range :ontolex/Form,
   :vs/term_status "stable"})

(def lexicalizedSense
  {:db/ident :ontolex/lexicalizedSense,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #{{:rdf/language "en",
      :rdf/value
      "The 'lexicalized sense' property relates a lexical concept to a corresponding lexical sense that lexicalizes the concept."}
     {:rdf/language "ru",
      :rdf/value
      "Свойство 'лексикализованный смысл' связывает лексическое понятие с соответствующим лексическим смыслом, который лексикализует понятие."}},
   :rdfs/domain :ontolex/LexicalConcept,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/lemon/ontolex"},
   :rdfs/label #{{:rdf/language "sv",
                  :rdf/value    "lexikaliserad betydelse"}
                 {:rdf/language "ro",
                  :rdf/value    "sens lexicalizat"}
                 {:rdf/language "ru",
                  :rdf/value    "лексикализованный смысл"}
                 {:rdf/language "nl",
                  :rdf/value    "lexikaal zin"}
                 {:rdf/language "de",
                  :rdf/value    "lexikalisierter Sinn"}
                 {:rdf/language "en",
                  :rdf/value    "lexicalized sense"}
                 {:rdf/language "fr",
                  :rdf/value    "signification lexicalisé"}
                 {:rdf/language "af",
                  :rdf/value    "geleksikaliseerde Sin"}
                 {:rdf/language "es",
                  :rdf/value    "acepción lexicalizada"}
                 {:rdf/language "it",
                  :rdf/value    "senso lessicalizzato"}},
   :rdfs/range :ontolex/LexicalSense,
   :vs/term_status "stable"})

(def morphologicalPattern
  {:db/ident :ontolex/morphologicalPattern,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #{{:rdf/language "en",
      :rdf/value
      "The 'morphological pattern' property indicates the morphological class of a word."}
     {:rdf/language "ru",
      :rdf/value
      "Свойство 'морфологическая модель' обозначает морфологический класс слова."}},
   :rdfs/domain :ontolex/LexicalEntry,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/lemon/ontolex"},
   :rdfs/label #{{:rdf/language "ro",
                  :rdf/value    "model morfologic"}
                 {:rdf/language "fr",
                  :rdf/value    "patron morphologique"}
                 {:rdf/language "af",
                  :rdf/value    "morfologiese patroon"}
                 {:rdf/language "ru",
                  :rdf/value    "морфологическая модель"}
                 {:rdf/language "sv",
                  :rdf/value    "morfologiskt mönster"}
                 {:rdf/language "de",
                  :rdf/value    "morphologisches Muster"}
                 {:rdf/language "nl",
                  :rdf/value    "morfologische patroon"}
                 {:rdf/language "it",
                  :rdf/value    "motivo morfologico"}
                 {:rdf/language "es",
                  :rdf/value    "patrón morfológico"}
                 {:rdf/language "en",
                  :rdf/value    "morphological pattern"}},
   :vs/term_status "stable"})

(def otherForm
  {:db/ident :ontolex/otherForm,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #{{:rdf/language "en",
      :rdf/value
      "The  'other form' property relates a lexical entry to a non-preferred (\"non-lemma\") form that realizes the given lexical entry."}
     {:rdf/language "ru",
      :rdf/value
      "Свойство 'другая форма' связывает словарную единицу с малоупотребительной формой (\"не леммой\"), которая является реализацией данной словарной единицы"}},
   :rdfs/domain :ontolex/LexicalEntry,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/lemon/ontolex"},
   :rdfs/label #{{:rdf/language "en",
                  :rdf/value    "other form"}
                 {:rdf/language "it",
                  :rdf/value    "altra forma"}
                 {:rdf/language "ru",
                  :rdf/value    "другая форма"}
                 {:rdf/language "ro",
                  :rdf/value    "altă formă"}
                 {:rdf/language "pt",
                  :rdf/value    "outra forma"}
                 {:rdf/language "sv",
                  :rdf/value    "annan form"}
                 {:rdf/language "de",
                  :rdf/value    "andere Form"}
                 {:rdf/language "af",
                  :rdf/value    "ander form"}
                 {:rdf/language "fr",
                  :rdf/value    "autre forme"}
                 {:rdf/language "nl",
                  :rdf/value    "andere vorm"}
                 {:rdf/language "es",
                  :rdf/value    "otra forma"}},
   :rdfs/range :ontolex/Form,
   :rdfs/subPropertyOf :ontolex/lexicalForm,
   :vs/term_status "stable"})

(def phoneticRep
  {:db/ident :ontolex/phoneticRep,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #{{:rdf/language "ru",
      :rdf/value
      "Свойство 'фонетическое представление' обозначает фонетическое представление произношения формы с использованием какой-либо схемы, например, Международного фонетического алфавита (IPA, МФА)."}
     {:rdf/language "en",
      :rdf/value
      "The 'phonetic representation' property indicates one phonetic representation of the pronunciation of the form using a scheme such as the International Phonetic Alphabet (IPA). "}},
   :rdfs/domain :ontolex/Form,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/lemon/ontolex"},
   :rdfs/label #{{:rdf/language "de",
                  :rdf/value    "phonetische Darstellung"}
                 {:rdf/language "af",
                  :rdf/value    "fonetiese voorstelling"}
                 {:rdf/language "ru",
                  :rdf/value    "фонетическое представление"}
                 {:rdf/language "es",
                  :rdf/value    "representación fonética"}
                 {:rdf/language "ro",
                  :rdf/value    "reprezentare fonetică"}
                 {:rdf/language "en",
                  :rdf/value    "phonetic representation"}
                 {:rdf/language "nl",
                  :rdf/value    "fonetische voorstelling"}
                 {:rdf/language "fr",
                  :rdf/value    "représentation phonétique"}
                 {:rdf/language "it",
                  :rdf/value    "rappresentazione fonetica"}
                 {:rdf/language "sv",
                  :rdf/value    "fonetisk representation "}},
   :rdfs/range :rdf/langString,
   :rdfs/subPropertyOf :ontolex/representation,
   :vs/term_status "stable"})

(def reference
  {:db/ident :ontolex/reference,
   :rdf/type #{:owl/ObjectProperty :owl/FunctionalProperty},
   :rdfs/comment
   #{{:rdf/language "ru",
      :rdf/value
      "Свойство 'референция' соотносит лексический смысл с предикатом в онтологии, который уточняет значение денотата (соответствующей словарной единицы)."}
     {:rdf/language "en",
      :rdf/value
      "The 'reference' property relates a lexical sense to an ontological predicate that represents the denotation of the corresponding lexical entry. "}},
   :rdfs/domain {:owl/unionOf [:ontolex/LexicalSense :synsem/OntoMap],
                 :rdf/type    :owl/Class},
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/lemon/ontolex"},
   :rdfs/label #{{:rdf/language "sv",
                  :rdf/value    "referens"}
                 {:rdf/language "it",
                  :rdf/value    "riferimento"}
                 {:rdf/language "ro",
                  :rdf/value    "referință"}
                 {:rdf/language "en",
                  :rdf/value    "reference"}
                 {:rdf/language "nl",
                  :rdf/value    "referntie"}
                 {:rdf/language "es",
                  :rdf/value    "referencia"}
                 {:rdf/language "pt",
                  :rdf/value    "referência"}
                 {:rdf/language "af",
                  :rdf/value    "verwysing"}
                 {:rdf/language "de",
                  :rdf/value    "Referenz"}
                 {:rdf/language "ru",
                  :rdf/value    "референция"}
                 {:rdf/language "fr",
                  :rdf/value    "référence"}},
   :rdfs/range :rdfs/Resource,
   :vs/term_status "stable"})

(def representation
  {:db/ident :ontolex/representation,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #{{:rdf/language "ru",
      :rdf/value
      "Свойство 'представление' обозначает некую последовательность, с помощью которой форма может быть представлена средствами орфографии."}
     {:rdf/language "en",
      :rdf/value
      "The 'representation' property indicates a string by which the form is represented according to some orthography. "}},
   :rdfs/domain :ontolex/Form,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/lemon/ontolex"},
   :rdfs/label #{{:rdf/language "sv",
                  :rdf/value    "representation"}
                 {:rdf/language "ru",
                  :rdf/value    "представление"}
                 {:rdf/language "fr",
                  :rdf/value    "représentation"}
                 {:rdf/language "de",
                  :rdf/value    "Darstellung"}
                 {:rdf/language "es",
                  :rdf/value    "representación"}
                 {:rdf/language "nl",
                  :rdf/value    "voorstelling"}
                 {:rdf/language "ro",
                  :rdf/value    "reprezentare"}
                 {:rdf/language "en",
                  :rdf/value    "representation"}
                 {:rdf/language "af",
                  :rdf/value    "voorstelling"}
                 {:rdf/language "it",
                  :rdf/value    "rappresentazione"}
                 {:rdf/language "pt",
                  :rdf/value    "representação"}},
   :rdfs/range :rdf/langString,
   :vs/term_status "stable"})

(def sense
  {:db/ident :ontolex/sense,
   :owl/inverseOf :ontolex/isSenseOf,
   :rdf/type #{:owl/ObjectProperty :owl/InverseFunctionalProperty},
   :rdfs/comment
   #{{:rdf/language "en",
      :rdf/value
      "The 'sense' property relates a lexical entry to one of its lexical senses. "}
     {:rdf/language "ru",
      :rdf/value
      "Свойство 'смысл' связывает словарную единицу с одним из ее лексических смыслов."}},
   :rdfs/domain :ontolex/LexicalEntry,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/lemon/ontolex"},
   :rdfs/label #{{:rdf/language "af",
                  :rdf/value    "sinne"}
                 {:rdf/language "ro",
                  :rdf/value    "sens"}
                 {:rdf/language "sv",
                  :rdf/value    "betydelse"}
                 {:rdf/language "es",
                  :rdf/value    "acepción"}
                 {:rdf/language "pt",
                  :rdf/value    "sentido"}
                 {:rdf/language "ru",
                  :rdf/value    "смысл"}
                 {:rdf/language "it",
                  :rdf/value    "senso"}
                 {:rdf/language "de",
                  :rdf/value    "Sinn"}
                 {:rdf/language "nl",
                  :rdf/value    "zin"}
                 {:rdf/language "fr",
                  :rdf/value    "signification"}
                 {:rdf/language "en",
                  :rdf/value    "sense"}},
   :rdfs/range :ontolex/LexicalSense,
   :vs/term_status "stable"})

(def usage
  {:db/ident :ontolex/usage,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #{{:rdf/language "en",
      :rdf/value
      "The 'usage' property indicates usage conditions or pragmatic implications when using the lexical entry to refer to the given ontological meaning."}
     {:rdf/language "ru",
      :rdf/value
      "Свойство 'употребление' обозначает условия использования или прагматическое значение при употреблении словарной единицы для соотнесения с определенным значением в онтологии."}},
   :rdfs/domain :ontolex/LexicalSense,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/lemon/ontolex"},
   :rdfs/label #{{:rdf/language "de",
                  :rdf/value    "Gebrauch"}
                 {:rdf/language "es",
                  :rdf/value    "uso"}
                 {:rdf/language "fr",
                  :rdf/value    "usage"}
                 {:rdf/language "nl",
                  :rdf/value    "gebruik"}
                 {:rdf/language "it",
                  :rdf/value    "uso"}
                 {:rdf/language "en",
                  :rdf/value    "usage"}
                 {:rdf/language "ru",
                  :rdf/value    "употребление"}},
   :rdfs/range :rdfs/Resource,
   :vs/term_status "stable"})

(def writtenRep
  {:db/ident :ontolex/writtenRep,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #{{:rdf/language "ru",
      :rdf/value
      "Свойство 'письменное представление' обозначает письменное представление формы."}
     {:rdf/language "en",
      :rdf/value
      "The 'written representation' property indicates the written representation of a form."}},
   :rdfs/domain :ontolex/Form,
   :rdfs/isDefinedBy {:xsd/anyURI "http://www.w3.org/ns/lemon/ontolex"},
   :rdfs/label #{{:rdf/language "af",
                  :rdf/value    "geskrewe voorstelling"}
                 {:rdf/language "en",
                  :rdf/value    "written representation"}
                 {:rdf/language "pt",
                  :rdf/value    "representação escrita"}
                 {:rdf/language "fr",
                  :rdf/value    "représentation écrite"}
                 {:rdf/language "nl",
                  :rdf/value    "schriftlijke voorstelling"}
                 {:rdf/language "ro",
                  :rdf/value    "reprezentare scrisă"}
                 {:rdf/language "it",
                  :rdf/value    "rappresentazione scritta"}
                 {:rdf/language "es",
                  :rdf/value    "representación escrita"}
                 {:rdf/language "sv",
                  :rdf/value    "skriven form "}
                 {:rdf/language "ru",
                  :rdf/value    "письменное представление"}
                 {:rdf/language "de",
                  :rdf/value    "schriftliche Darstellung"}},
   :rdfs/range :rdf/langString,
   :rdfs/subPropertyOf :ontolex/representation,
   :vs/term_status "stable"})

(def urn:uuid:7b789ad2-ba80-5148-a999-d19176cb7fc8
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
    "A model for the representation of lexical information relative to ontologies. Core module."},
   :dc11/issued {:rdf/type  :xsd/date,
                 :rdf/value "2016-01-10"},
   :dc11/modified {:rdf/type  :xsd/date,
                   :rdf/value "2016-01-10"},
   :dc11/publisher {:xsd/anyURI "http://www.w3.org/community/ontolex"},
   :dc11/rights "CC-Zero",
   :dc11/title {:rdf/language "en",
                :rdf/value    "Lexicon Model for Ontologies - Core"},
   :owl/versionInfo 1.1M,
   :rdf/type #{:owl/Ontology :voaf/Vocabulary},
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "-Version 1.0: depreciation with minor change in metadata for LOV publication\n-Version 1.1: creation"},
   :vann/preferredNamespacePrefix "ontolex",
   :vann/preferredNamespaceUri "http://www.w3.org/ns/lemon/ontolex#",
   :xsd/anyURI "http://www.w3.org/ns/lemon/ontolex"})