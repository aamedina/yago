(ns net.wikipunk.rdf.yago.shapes
  "http://yago-knowledge.org/value/"
  {:dcat/downloadURL  "resources/yago-wd-shapes.nt.gz",
   :rdf/ns-prefix-map {"yago.shapes" "http://yago-knowledge.org/value/"},
   :rdf/type          :rdfa/PrefixMapping,
   :rdfa/prefix       "yago.shapes",
   :rdfa/uri          "http://yago-knowledge.org/value/"})

(def sh-datatype-xsd-date
  {:db/ident    :yago.shapes/sh-datatype-xsd-date,
   :sh/datatype :xsd/date})

(def sh-datatype-xsd-dateTime
  {:db/ident    :yago.shapes/sh-datatype-xsd-dateTime,
   :sh/datatype :xsd/dateTime})

(def sh-datatype-xsd-gYear
  {:db/ident    :yago.shapes/sh-datatype-xsd-gYear,
   :sh/datatype :xsd/gYear})

(def sh-datatype-xsd-gYearMonth
  {:db/ident    :yago.shapes/sh-datatype-xsd-gYearMonth,
   :sh/datatype :xsd/gYearMonth})

(def sh-node-schema-Brand
  {:db/ident :yago.shapes/sh-node-schema-Brand,
   :sh/node  :schema/Brand})

(def sh-node-schema-MusicGroup
  {:db/ident :yago.shapes/sh-node-schema-MusicGroup,
   :sh/node  :schema/MusicGroup})

(def sh-node-schema-Organization
  {:db/ident :yago.shapes/sh-node-schema-Organization,
   :sh/node  :schema/Organization})

(def sh-node-schema-Person
  {:db/ident :yago.shapes/sh-node-schema-Person,
   :sh/node  :schema/Person})

(def sh-node-schema-SportsTeam
  {:db/ident :yago.shapes/sh-node-schema-SportsTeam,
   :sh/node  :schema/SportsTeam})

(def shape-prop-bioschema-BioChemEntity-bioschema-bioChemInteraction
  {:db/ident
   :yago.shapes/shape-prop-bioschema-BioChemEntity-bioschema-bioChemInteraction,
   :rdf/type :sh/PropertyShape,
   :sh/node :bioschema/BioChemEntity,
   :sh/path :bioschema/bioChemInteraction})

(def shape-prop-bioschema-BioChemEntity-bioschema-hasMolecularFunction
  {:db/ident
   :yago.shapes/shape-prop-bioschema-BioChemEntity-bioschema-hasMolecularFunction,
   :rdf/type :sh/PropertyShape,
   :sh/node :schema/Thing,
   :sh/path :bioschema/hasMolecularFunction})

(def shape-prop-bioschema-BioChemEntity-bioschema-isEncodedByBioChemEntity
  {:db/ident
   :yago.shapes/shape-prop-bioschema-BioChemEntity-bioschema-isEncodedByBioChemEntity,
   :rdf/type :sh/PropertyShape,
   :sh/node :bioschema/Gene,
   :sh/path :bioschema/isEncodedByBioChemEntity})

(def shape-prop-bioschema-BioChemEntity-bioschema-isInvolvedInBiologicalProcess
  {:db/ident
   :yago.shapes/shape-prop-bioschema-BioChemEntity-bioschema-isInvolvedInBiologicalProcess,
   :rdf/type :sh/PropertyShape,
   :sh/node :schema/Thing,
   :sh/path :bioschema/isInvolvedInBiologicalProcess})

(def shape-prop-bioschema-BioChemEntity-bioschema-isLocatedInSubcellularLocation
  {:db/ident
   :yago.shapes/shape-prop-bioschema-BioChemEntity-bioschema-isLocatedInSubcellularLocation,
   :rdf/type :sh/PropertyShape,
   :sh/node :schema/Thing,
   :sh/path :bioschema/isLocatedInSubcellularLocation})

(def shape-prop-bioschema-Gene-bioschema-encodesBioChemEntity
  {:db/ident
   :yago.shapes/shape-prop-bioschema-Gene-bioschema-encodesBioChemEntity,
   :rdf/type :sh/PropertyShape,
   :sh/node :bioschema/BioChemEntity,
   :sh/path :bioschema/encodesBioChemEntity})

(def shape-prop-bioschema-Gene-bioschema-expressedIn
  {:db/ident :yago.shapes/shape-prop-bioschema-Gene-bioschema-expressedIn,
   :rdf/type :sh/PropertyShape,
   :sh/node  :schema/Thing,
   :sh/path  :bioschema/expressedIn})

(def shape-prop-bioschema-MolecularEntity-bioschema-inChI
  {:db/ident :yago.shapes/shape-prop-bioschema-MolecularEntity-bioschema-inChI,
   :rdf/type :sh/PropertyShape,
   :sh/datatype :xsd/string,
   :sh/maxCount 1,
   :sh/path :bioschema/inChI,
   :sh/pattern
   "^1S/([0-9]*[A-Z][ub]?[a-z]?[0-9]*\\.?)+(/[0-9A-Za-z+\\-(),.*;?]+)*$"})

(def shape-prop-bioschema-MolecularEntity-bioschema-inChIKey
  {:db/ident
   :yago.shapes/shape-prop-bioschema-MolecularEntity-bioschema-inChIKey,
   :rdf/type :sh/PropertyShape,
   :sh/datatype :xsd/string,
   :sh/maxCount 1,
   :sh/path :bioschema/inChIKey,
   :sh/pattern "^[A-Z]{14}-[A-Z]{10}-[A-Z]$"})

(def shape-prop-bioschema-MolecularEntity-bioschema-molecularFormula
  {:db/ident
   :yago.shapes/shape-prop-bioschema-MolecularEntity-bioschema-molecularFormula,
   :rdf/type :sh/PropertyShape,
   :sh/datatype :xsd/string,
   :sh/maxCount 1,
   :sh/path :bioschema/molecularFormula})

(def shape-prop-bioschema-MolecularEntity-bioschema-smiles
  {:db/ident :yago.shapes/shape-prop-bioschema-MolecularEntity-bioschema-smiles,
   :rdf/type :sh/PropertyShape,
   :sh/datatype :xsd/string,
   :sh/path :bioschema/smiles,
   :sh/pattern "^[A-Za-z0-9+\\-\\*=#$:().>/\\\\\\[\\]%]+$"})

(def shape-prop-bioschema-Taxon-bioschema-parentTaxon
  {:db/ident :yago.shapes/shape-prop-bioschema-Taxon-bioschema-parentTaxon,
   :rdf/type :sh/PropertyShape,
   :sh/node  :bioschema/Taxon,
   :sh/path  :bioschema/parentTaxon})

(def shape-prop-bioschema-Taxon-bioschema-taxonRank
  {:db/ident    :yago.shapes/shape-prop-bioschema-Taxon-bioschema-taxonRank,
   :rdf/type    :sh/PropertyShape,
   :sh/maxCount 1,
   :sh/node     :schema/Thing,
   :sh/path     :bioschema/taxonRank})

(def shape-prop-schema-Airline-schema-iataCode
  {:db/ident    :yago.shapes/shape-prop-schema-Airline-schema-iataCode,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/string,
   :sh/maxCount 1,
   :sh/path     :schema/iataCode,
   :sh/pattern  "^[A-Z0-9]{2}$"})

(def shape-prop-schema-Airline-schema-icaoCode
  {:db/ident    :yago.shapes/shape-prop-schema-Airline-schema-icaoCode,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/string,
   :sh/maxCount 1,
   :sh/path     :schema/icaoCode,
   :sh/pattern  "^[A-Z]{3}$"})

(def shape-prop-schema-Airport-schema-iataCode
  {:db/ident    :yago.shapes/shape-prop-schema-Airport-schema-iataCode,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/string,
   :sh/maxCount 1,
   :sh/path     :schema/iataCode,
   :sh/pattern  "^[A-Z]{3}$"})

(def shape-prop-schema-Airport-schema-icaoCode
  {:db/ident    :yago.shapes/shape-prop-schema-Airport-schema-icaoCode,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/string,
   :sh/maxCount 1,
   :sh/path     :schema/icaoCode,
   :sh/pattern  "^([A-Z]{2}|[CKY][A-Z0-9])[A-Z0-9]{2}$"})

(def shape-prop-schema-AnatomicalStructure-schema-connectedTo
  {:db/ident
   :yago.shapes/shape-prop-schema-AnatomicalStructure-schema-connectedTo,
   :rdf/type :sh/PropertyShape,
   :sh/node :schema/AnatomicalStructure,
   :sh/path :schema/connectedTo})

(def shape-prop-schema-Article-schema-pagination
  {:db/ident    :yago.shapes/shape-prop-schema-Article-schema-pagination,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/string,
   :sh/path     :schema/pagination})

(def shape-prop-schema-Book-schema-illustrator
  {:db/ident :yago.shapes/shape-prop-schema-Book-schema-illustrator,
   :rdf/type :sh/PropertyShape,
   :sh/node  :schema/Person,
   :sh/path  :schema/illustrator})

(def shape-prop-schema-Book-schema-isbn
  {:db/ident :yago.shapes/shape-prop-schema-Book-schema-isbn,
   :rdf/type :sh/PropertyShape,
   :sh/datatype :xsd/string,
   :sh/maxCount 1,
   :sh/path :schema/isbn,
   :sh/pattern
   "^(97[89]-([0-57]-(\\d-\\d{7}|\\d\\d-\\d{6}|\\d\\d\\d-\\d{5}|\\d{4}-\\d{4}|\\d{5}-\\d\\d\\d|\\d{6}-\\d\\d|\\d{7}-\\d)|[89]\\d-(\\d-\\d{6}|\\d\\d-\\d{5}|\\d\\d\\d-\\d{4}|\\d{4}-\\d\\d\\d|\\d{5}-\\d\\d|\\d{6}-\\d)|[69]\\d\\d-(\\d-\\d{5}|\\d\\d-\\d{4}|\\d\\d\\d-\\d\\d\\d|\\d{4}-\\d\\d|\\d{5}-\\d)|99[0-8]\\d-\\d-\\d{4}|99[0-8]\\d-\\d\\d-\\d\\d\\d|99[0-8]\\d-\\d\\d\\d-\\d\\d|99[0-8]\\d-\\d{4}-\\d|999\\d\\d-\\d-\\d\\d\\d|999\\d\\d-\\d\\d-\\d\\d|999\\d\\d-\\d\\d\\d-\\d)-\\d|\\d{9}(\\d|X))|(\\d{1,5}-\\d{1,7}-\\d{1,6}-[0-9X])$"})

(def shape-prop-schema-Book-schema-numberOfPages
  {:db/ident    :yago.shapes/shape-prop-schema-Book-schema-numberOfPages,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/integer,
   :sh/maxCount 1,
   :sh/path     :schema/numberOfPages})

(def shape-prop-schema-Brand-schema-logo
  {:db/ident :yago.shapes/shape-prop-schema-Brand-schema-logo,
   :rdf/type :sh/PropertyShape,
   :sh/node  :schema/ImageObject,
   :sh/path  :schema/logo})

(def shape-prop-schema-BroadcastChannel-schema-broadcastChannelId
  {:db/ident
   :yago.shapes/shape-prop-schema-BroadcastChannel-schema-broadcastChannelId,
   :rdf/type :sh/PropertyShape,
   :sh/datatype :xsd/string,
   :sh/path :schema/broadcastChannelId})

(def shape-prop-schema-BroadcastService-schema-callSign
  {:db/ident    :yago.shapes/shape-prop-schema-BroadcastService-schema-callSign,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/string,
   :sh/path     :schema/callSign})

(def shape-prop-schema-City-schema-iataCode
  {:db/ident    :yago.shapes/shape-prop-schema-City-schema-iataCode,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/string,
   :sh/maxCount 1,
   :sh/path     :schema/iataCode,
   :sh/pattern  "^[A-Z]{3}$"})

(def shape-prop-schema-ComicStory-schema-colorist
  {:db/ident :yago.shapes/shape-prop-schema-ComicStory-schema-colorist,
   :rdf/type :sh/PropertyShape,
   :sh/node  :schema/Person,
   :sh/path  :schema/colorist})

(def shape-prop-schema-CreativeWork-schema-about
  {:db/ident :yago.shapes/shape-prop-schema-CreativeWork-schema-about,
   :rdf/type :sh/PropertyShape,
   :sh/node  :schema/Thing,
   :sh/path  :schema/about})

(def shape-prop-schema-CreativeWork-schema-author
  {:db/ident :yago.shapes/shape-prop-schema-CreativeWork-schema-author,
   :rdf/type :sh/PropertyShape,
   :sh/or    [:yago.shapes/sh-node-schema-Organization
              :yago.shapes/sh-node-schema-Person],
   :sh/path  :schema/author})

(def shape-prop-schema-CreativeWork-schema-award
  {:db/ident :yago.shapes/shape-prop-schema-CreativeWork-schema-award,
   :rdf/type :sh/PropertyShape,
   :sh/node  :schema/Thing,
   :sh/path  :schema/award})

(def shape-prop-schema-CreativeWork-schema-character
  {:db/ident :yago.shapes/shape-prop-schema-CreativeWork-schema-character,
   :rdf/type :sh/PropertyShape,
   :sh/node  :schema/Person,
   :sh/path  :schema/character})

(def shape-prop-schema-CreativeWork-schema-citation
  {:db/ident :yago.shapes/shape-prop-schema-CreativeWork-schema-citation,
   :rdf/type :sh/PropertyShape,
   :sh/node  :schema/CreativeWork,
   :sh/path  :schema/citation})

(def shape-prop-schema-CreativeWork-schema-contentLocation
  {:db/ident :yago.shapes/shape-prop-schema-CreativeWork-schema-contentLocation,
   :rdf/type :sh/PropertyShape,
   :sh/node  :schema/Place,
   :sh/path  :schema/contentLocation})

(def shape-prop-schema-CreativeWork-schema-contentRating
  {:db/ident :yago.shapes/shape-prop-schema-CreativeWork-schema-contentRating,
   :rdf/type :sh/PropertyShape,
   :sh/node  :schema/Rating,
   :sh/path  :schema/contentRating})

(def shape-prop-schema-CreativeWork-schema-contributor
  {:db/ident :yago.shapes/shape-prop-schema-CreativeWork-schema-contributor,
   :rdf/type :sh/PropertyShape,
   :sh/or    [:yago.shapes/sh-node-schema-Organization
              :yago.shapes/sh-node-schema-Person],
   :sh/path  :schema/contributor})

(def shape-prop-schema-CreativeWork-schema-copyrightHolder
  {:db/ident :yago.shapes/shape-prop-schema-CreativeWork-schema-copyrightHolder,
   :rdf/type :sh/PropertyShape,
   :sh/or    [:yago.shapes/sh-node-schema-Organization
              :yago.shapes/sh-node-schema-Person],
   :sh/path  :schema/copyrightHolder})

(def shape-prop-schema-CreativeWork-schema-creator
  {:db/ident :yago.shapes/shape-prop-schema-CreativeWork-schema-creator,
   :rdf/type :sh/PropertyShape,
   :sh/or    [:yago.shapes/sh-node-schema-Organization
              :yago.shapes/sh-node-schema-Person],
   :sh/path  :schema/creator})

(def shape-prop-schema-CreativeWork-schema-dateCreated
  {:db/ident    :yago.shapes/shape-prop-schema-CreativeWork-schema-dateCreated,
   :rdf/type    :sh/PropertyShape,
   :sh/maxCount 1,
   :sh/or       [:yago.shapes/sh-datatype-xsd-dateTime
                 :yago.shapes/sh-datatype-xsd-date
                 :yago.shapes/sh-datatype-xsd-gYearMonth
                 :yago.shapes/sh-datatype-xsd-gYear],
   :sh/path     :schema/dateCreated})

(def shape-prop-schema-CreativeWork-schema-datePublished
  {:db/ident :yago.shapes/shape-prop-schema-CreativeWork-schema-datePublished,
   :rdf/type :sh/PropertyShape,
   :sh/maxCount 1,
   :sh/or [:yago.shapes/sh-datatype-xsd-dateTime
           :yago.shapes/sh-datatype-xsd-date
           :yago.shapes/sh-datatype-xsd-gYearMonth
           :yago.shapes/sh-datatype-xsd-gYear],
   :sh/path :schema/datePublished})

(def shape-prop-schema-CreativeWork-schema-editor
  {:db/ident :yago.shapes/shape-prop-schema-CreativeWork-schema-editor,
   :rdf/type :sh/PropertyShape,
   :sh/node  :schema/Person,
   :sh/path  :schema/editor})

(def shape-prop-schema-CreativeWork-schema-encodingFormat
  {:db/ident :yago.shapes/shape-prop-schema-CreativeWork-schema-encodingFormat,
   :rdf/type :sh/PropertyShape,
   :sh/datatype :xsd/string,
   :sh/maxCount 1,
   :sh/path :schema/encodingFormat,
   :sh/pattern
   "^(application|audio|example|font|image|message|model|multipart|text|video)/[a-zA-Z0-9-+.]+$"})

(def shape-prop-schema-CreativeWork-schema-exampleOfWork
  {:db/ident :yago.shapes/shape-prop-schema-CreativeWork-schema-exampleOfWork,
   :rdf/type :sh/PropertyShape,
   :sh/node  :schema/CreativeWork,
   :sh/path  :schema/exampleOfWork})

(def shape-prop-schema-CreativeWork-schema-genre
  {:db/ident :yago.shapes/shape-prop-schema-CreativeWork-schema-genre,
   :rdf/type :sh/PropertyShape,
   :sh/node  :schema/Thing,
   :sh/path  :schema/genre})

(def shape-prop-schema-CreativeWork-schema-hasPart
  {:db/ident :yago.shapes/shape-prop-schema-CreativeWork-schema-hasPart,
   :rdf/type :sh/PropertyShape,
   :sh/node  :schema/CreativeWork,
   :sh/path  :schema/hasPart})

(def shape-prop-schema-CreativeWork-schema-inLanguage
  {:db/ident :yago.shapes/shape-prop-schema-CreativeWork-schema-inLanguage,
   :rdf/type :sh/PropertyShape,
   :sh/node  :schema/Language,
   :sh/path  :schema/inLanguage})

(def shape-prop-schema-CreativeWork-schema-isBasedOn
  {:db/ident :yago.shapes/shape-prop-schema-CreativeWork-schema-isBasedOn,
   :rdf/type :sh/PropertyShape,
   :sh/node  :schema/CreativeWork,
   :sh/path  :schema/isBasedOn})

(def shape-prop-schema-CreativeWork-schema-isPartOf
  {:db/ident :yago.shapes/shape-prop-schema-CreativeWork-schema-isPartOf,
   :rdf/type :sh/PropertyShape,
   :sh/node  :schema/CreativeWork,
   :sh/path  :schema/isPartOf})

(def shape-prop-schema-CreativeWork-schema-license
  {:db/ident :yago.shapes/shape-prop-schema-CreativeWork-schema-license,
   :rdf/type :sh/PropertyShape,
   :sh/node  :schema/CreativeWork,
   :sh/path  :schema/license})

(def shape-prop-schema-CreativeWork-schema-locationCreated
  {:db/ident :yago.shapes/shape-prop-schema-CreativeWork-schema-locationCreated,
   :rdf/type :sh/PropertyShape,
   :sh/node  :schema/Place,
   :sh/path  :schema/locationCreated})

(def shape-prop-schema-CreativeWork-schema-material
  {:db/ident :yago.shapes/shape-prop-schema-CreativeWork-schema-material,
   :rdf/type :sh/PropertyShape,
   :sh/node  :schema/Thing,
   :sh/path  :schema/material})

(def shape-prop-schema-CreativeWork-schema-position
  {:db/ident    :yago.shapes/shape-prop-schema-CreativeWork-schema-position,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/integer,
   :sh/maxCount 1,
   :sh/path     :schema/position})

(def shape-prop-schema-CreativeWork-schema-producer
  {:db/ident :yago.shapes/shape-prop-schema-CreativeWork-schema-producer,
   :rdf/type :sh/PropertyShape,
   :sh/or    [:yago.shapes/sh-node-schema-Organization
              :yago.shapes/sh-node-schema-Person],
   :sh/path  :schema/producer})

(def shape-prop-schema-CreativeWork-schema-provider
  {:db/ident :yago.shapes/shape-prop-schema-CreativeWork-schema-provider,
   :rdf/type :sh/PropertyShape,
   :sh/or    [:yago.shapes/sh-node-schema-Organization
              :yago.shapes/sh-node-schema-Person],
   :sh/path  :schema/provider})

(def shape-prop-schema-CreativeWork-schema-publisher
  {:db/ident :yago.shapes/shape-prop-schema-CreativeWork-schema-publisher,
   :rdf/type :sh/PropertyShape,
   :sh/or    [:yago.shapes/sh-node-schema-Organization
              :yago.shapes/sh-node-schema-Person],
   :sh/path  :schema/publisher})

(def shape-prop-schema-CreativeWork-schema-sponsor
  {:db/ident :yago.shapes/shape-prop-schema-CreativeWork-schema-sponsor,
   :rdf/type :sh/PropertyShape,
   :sh/or    [:yago.shapes/sh-node-schema-Organization
              :yago.shapes/sh-node-schema-Person],
   :sh/path  :schema/sponsor})

(def shape-prop-schema-CreativeWork-schema-translator
  {:db/ident :yago.shapes/shape-prop-schema-CreativeWork-schema-translator,
   :rdf/type :sh/PropertyShape,
   :sh/or    [:yago.shapes/sh-node-schema-Organization
              :yago.shapes/sh-node-schema-Person],
   :sh/path  :schema/translator})

(def shape-prop-schema-CreativeWork-schema-workExample
  {:db/ident :yago.shapes/shape-prop-schema-CreativeWork-schema-workExample,
   :rdf/type :sh/PropertyShape,
   :sh/node  :schema/CreativeWork,
   :sh/path  :schema/workExample})

(def shape-prop-schema-CreativeWorkSeason-schema-actor
  {:db/ident :yago.shapes/shape-prop-schema-CreativeWorkSeason-schema-actor,
   :rdf/type :sh/PropertyShape,
   :sh/node  :schema/Person,
   :sh/path  :schema/actor})

(def shape-prop-schema-CreativeWorkSeason-schema-numberOfEpisodes
  {:db/ident
   :yago.shapes/shape-prop-schema-CreativeWorkSeason-schema-numberOfEpisodes,
   :rdf/type :sh/PropertyShape,
   :sh/datatype :xsd/integer,
   :sh/maxCount 1,
   :sh/path :schema/numberOfEpisodes})

(def shape-prop-schema-CreativeWorkSeason-schema-partOfSeries
  {:db/ident
   :yago.shapes/shape-prop-schema-CreativeWorkSeason-schema-partOfSeries,
   :rdf/type :sh/PropertyShape,
   :sh/node :schema/CreativeWorkSeries,
   :sh/path :schema/partOfSeries})

(def shape-prop-schema-CreativeWorkSeason-schema-productionCompany
  {:db/ident
   :yago.shapes/shape-prop-schema-CreativeWorkSeason-schema-productionCompany,
   :rdf/type :sh/PropertyShape,
   :sh/node :schema/Organization,
   :sh/path :schema/productionCompany})

(def shape-prop-schema-CreativeWorkSeries-schema-issn
  {:db/ident    :yago.shapes/shape-prop-schema-CreativeWorkSeries-schema-issn,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/string,
   :sh/maxCount 1,
   :sh/path     :schema/issn,
   :sh/pattern  "^[0-9]{4}-[0-9]{3}[0-9X]$"})

(def shape-prop-schema-Episode-schema-actor
  {:db/ident :yago.shapes/shape-prop-schema-Episode-schema-actor,
   :rdf/type :sh/PropertyShape,
   :sh/node  :schema/Person,
   :sh/path  :schema/actor})

(def shape-prop-schema-Episode-schema-director
  {:db/ident :yago.shapes/shape-prop-schema-Episode-schema-director,
   :rdf/type :sh/PropertyShape,
   :sh/node  :schema/Person,
   :sh/path  :schema/director})

(def shape-prop-schema-Episode-schema-musicBy
  {:db/ident :yago.shapes/shape-prop-schema-Episode-schema-musicBy,
   :rdf/type :sh/PropertyShape,
   :sh/or    [:yago.shapes/sh-node-schema-Person
              :yago.shapes/sh-node-schema-MusicGroup],
   :sh/path  :schema/musicBy})

(def shape-prop-schema-Episode-schema-partOfSeason
  {:db/ident    :yago.shapes/shape-prop-schema-Episode-schema-partOfSeason,
   :rdf/type    :sh/PropertyShape,
   :sh/maxCount 1,
   :sh/node     :schema/CreativeWorkSeason,
   :sh/path     :schema/partOfSeason})

(def shape-prop-schema-Episode-schema-partOfSeries
  {:db/ident :yago.shapes/shape-prop-schema-Episode-schema-partOfSeries,
   :rdf/type :sh/PropertyShape,
   :sh/node  :schema/CreativeWorkSeries,
   :sh/path  :schema/partOfSeries})

(def shape-prop-schema-Episode-schema-productionCompany
  {:db/ident :yago.shapes/shape-prop-schema-Episode-schema-productionCompany,
   :rdf/type :sh/PropertyShape,
   :sh/node  :schema/Organization,
   :sh/path  :schema/productionCompany})

(def shape-prop-schema-Event-schema-about
  {:db/ident :yago.shapes/shape-prop-schema-Event-schema-about,
   :rdf/type :sh/PropertyShape,
   :sh/node  :schema/Thing,
   :sh/path  :schema/about})

(def shape-prop-schema-Event-schema-composer
  {:db/ident :yago.shapes/shape-prop-schema-Event-schema-composer,
   :rdf/type :sh/PropertyShape,
   :sh/or    [:yago.shapes/sh-node-schema-Person
              :yago.shapes/sh-node-schema-MusicGroup],
   :sh/path  :schema/composer})

(def shape-prop-schema-Event-schema-contributor
  {:db/ident :yago.shapes/shape-prop-schema-Event-schema-contributor,
   :rdf/type :sh/PropertyShape,
   :sh/or    [:yago.shapes/sh-node-schema-Organization
              :yago.shapes/sh-node-schema-Person],
   :sh/path  :schema/contributor})

(def shape-prop-schema-Event-schema-duration
  {:db/ident    :yago.shapes/shape-prop-schema-Event-schema-duration,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/duration,
   :sh/path     :schema/duration})

(def shape-prop-schema-Event-schema-endDate
  {:db/ident    :yago.shapes/shape-prop-schema-Event-schema-endDate,
   :rdf/type    :sh/PropertyShape,
   :sh/maxCount 1,
   :sh/or       [:yago.shapes/sh-datatype-xsd-dateTime
                 :yago.shapes/sh-datatype-xsd-date
                 :yago.shapes/sh-datatype-xsd-gYearMonth
                 :yago.shapes/sh-datatype-xsd-gYear],
   :sh/path     :schema/endDate})

(def shape-prop-schema-Event-schema-location
  {:db/ident :yago.shapes/shape-prop-schema-Event-schema-location,
   :rdf/type :sh/PropertyShape,
   :sh/node  :schema/Place,
   :sh/path  :schema/location})

(def shape-prop-schema-Event-schema-organizer
  {:db/ident :yago.shapes/shape-prop-schema-Event-schema-organizer,
   :rdf/type :sh/PropertyShape,
   :sh/or    [:yago.shapes/sh-node-schema-Person
              :yago.shapes/sh-node-schema-MusicGroup],
   :sh/path  :schema/organizer})

(def shape-prop-schema-Event-schema-sponsor
  {:db/ident :yago.shapes/shape-prop-schema-Event-schema-sponsor,
   :rdf/type :sh/PropertyShape,
   :sh/or    [:yago.shapes/sh-node-schema-Organization
              :yago.shapes/sh-node-schema-Person],
   :sh/path  :schema/sponsor})

(def shape-prop-schema-Event-schema-startDate
  {:db/ident    :yago.shapes/shape-prop-schema-Event-schema-startDate,
   :rdf/type    :sh/PropertyShape,
   :sh/maxCount 1,
   :sh/or       [:yago.shapes/sh-datatype-xsd-dateTime
                 :yago.shapes/sh-datatype-xsd-date
                 :yago.shapes/sh-datatype-xsd-gYearMonth
                 :yago.shapes/sh-datatype-xsd-gYear],
   :sh/path     :schema/startDate})

(def shape-prop-schema-Event-schema-subEvent
  {:db/ident :yago.shapes/shape-prop-schema-Event-schema-subEvent,
   :rdf/type :sh/PropertyShape,
   :sh/node  :schema/Event,
   :sh/path  :schema/subEvent})

(def shape-prop-schema-Event-schema-superEvent
  {:db/ident :yago.shapes/shape-prop-schema-Event-schema-superEvent,
   :rdf/type :sh/PropertyShape,
   :sh/node  :schema/Event,
   :sh/path  :schema/superEvent})

(def shape-prop-schema-Event-schema-translator
  {:db/ident :yago.shapes/shape-prop-schema-Event-schema-translator,
   :rdf/type :sh/PropertyShape,
   :sh/or    [:yago.shapes/sh-node-schema-Organization
              :yago.shapes/sh-node-schema-Person],
   :sh/path  :schema/translator})

(def shape-prop-schema-FoodEstablishment-schema-servesCuisine
  {:db/ident
   :yago.shapes/shape-prop-schema-FoodEstablishment-schema-servesCuisine,
   :rdf/type :sh/PropertyShape,
   :sh/node :schema/Thing,
   :sh/path :schema/servesCuisine})

(def shape-prop-schema-GeoCoordinates-schema-latitude
  {:db/ident    :yago.shapes/shape-prop-schema-GeoCoordinates-schema-latitude,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/double,
   :sh/maxCount 1,
   :sh/path     :schema/latitude})

(def shape-prop-schema-GeoCoordinates-schema-longitude
  {:db/ident    :yago.shapes/shape-prop-schema-GeoCoordinates-schema-longitude,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/double,
   :sh/maxCount 1,
   :sh/path     :schema/longitude})

(def shape-prop-schema-MedicalCondition-schema-possibleTreatment
  {:db/ident
   :yago.shapes/shape-prop-schema-MedicalCondition-schema-possibleTreatment,
   :rdf/type :sh/PropertyShape,
   :sh/node :schema/MedicalTherapy,
   :sh/path :schema/possibleTreatment})

(def shape-prop-schema-MedicalCondition-schema-riskFactor
  {:db/ident :yago.shapes/shape-prop-schema-MedicalCondition-schema-riskFactor,
   :rdf/type :sh/PropertyShape,
   :sh/node  :schema/Thing,
   :sh/path  :schema/riskFactor})

(def shape-prop-schema-MedicalCondition-schema-signOrSymptom
  {:db/ident
   :yago.shapes/shape-prop-schema-MedicalCondition-schema-signOrSymptom,
   :rdf/type :sh/PropertyShape,
   :sh/node :schema/MedicalSignOrSymptom,
   :sh/path :schema/signOrSymptom})

(def shape-prop-schema-MedicalEntity-schema-legalStatus
  {:db/ident :yago.shapes/shape-prop-schema-MedicalEntity-schema-legalStatus,
   :rdf/type :sh/PropertyShape,
   :sh/node  :schema/DrugLegalStatus,
   :sh/path  :schema/legalStatus})

(def shape-prop-schema-MedicalEntity-schema-relevantSpecialty
  {:db/ident
   :yago.shapes/shape-prop-schema-MedicalEntity-schema-relevantSpecialty,
   :rdf/type :sh/PropertyShape,
   :sh/node :schema/MedicalSpecialty,
   :sh/path :schema/relevantSpecialty})

(def shape-prop-schema-MedicalSignOrSymptom-schema-possibleTreatment
  {:db/ident
   :yago.shapes/shape-prop-schema-MedicalSignOrSymptom-schema-possibleTreatment,
   :rdf/type :sh/PropertyShape,
   :sh/node :schema/MedicalTherapy,
   :sh/path :schema/possibleTreatment})

(def shape-prop-schema-Movie-schema-actor
  {:db/ident :yago.shapes/shape-prop-schema-Movie-schema-actor,
   :rdf/type :sh/PropertyShape,
   :sh/node  :schema/Person,
   :sh/path  :schema/actor})

(def shape-prop-schema-Movie-schema-countryOfOrigin
  {:db/ident :yago.shapes/shape-prop-schema-Movie-schema-countryOfOrigin,
   :rdf/type :sh/PropertyShape,
   :sh/node  :schema/Country,
   :sh/path  :schema/countryOfOrigin})

(def shape-prop-schema-Movie-schema-director
  {:db/ident :yago.shapes/shape-prop-schema-Movie-schema-director,
   :rdf/type :sh/PropertyShape,
   :sh/node  :schema/Person,
   :sh/path  :schema/director})

(def shape-prop-schema-Movie-schema-duration
  {:db/ident    :yago.shapes/shape-prop-schema-Movie-schema-duration,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/duration,
   :sh/path     :schema/duration})

(def shape-prop-schema-Movie-schema-musicBy
  {:db/ident :yago.shapes/shape-prop-schema-Movie-schema-musicBy,
   :rdf/type :sh/PropertyShape,
   :sh/or    [:yago.shapes/sh-node-schema-Person
              :yago.shapes/sh-node-schema-MusicGroup],
   :sh/path  :schema/musicBy})

(def shape-prop-schema-Movie-schema-productionCompany
  {:db/ident :yago.shapes/shape-prop-schema-Movie-schema-productionCompany,
   :rdf/type :sh/PropertyShape,
   :sh/node  :schema/Organization,
   :sh/path  :schema/productionCompany})

(def shape-prop-schema-MovieSeries-schema-actor
  {:db/ident :yago.shapes/shape-prop-schema-MovieSeries-schema-actor,
   :rdf/type :sh/PropertyShape,
   :sh/node  :schema/Person,
   :sh/path  :schema/actor})

(def shape-prop-schema-MovieSeries-schema-director
  {:db/ident :yago.shapes/shape-prop-schema-MovieSeries-schema-director,
   :rdf/type :sh/PropertyShape,
   :sh/node  :schema/Person,
   :sh/path  :schema/director})

(def shape-prop-schema-MovieSeries-schema-musicBy
  {:db/ident :yago.shapes/shape-prop-schema-MovieSeries-schema-musicBy,
   :rdf/type :sh/PropertyShape,
   :sh/or    [:yago.shapes/sh-node-schema-Person
              :yago.shapes/sh-node-schema-MusicGroup],
   :sh/path  :schema/musicBy})

(def shape-prop-schema-MovieSeries-schema-productionCompany
  {:db/ident
   :yago.shapes/shape-prop-schema-MovieSeries-schema-productionCompany,
   :rdf/type :sh/PropertyShape,
   :sh/node :schema/Organization,
   :sh/path :schema/productionCompany})

(def shape-prop-schema-MusicAlbum-schema-byArtist
  {:db/ident :yago.shapes/shape-prop-schema-MusicAlbum-schema-byArtist,
   :rdf/type :sh/PropertyShape,
   :sh/node  :schema/MusicGroup,
   :sh/path  :schema/byArtist})

(def shape-prop-schema-MusicComposition-schema-composer
  {:db/ident :yago.shapes/shape-prop-schema-MusicComposition-schema-composer,
   :rdf/type :sh/PropertyShape,
   :sh/or    [:yago.shapes/sh-node-schema-Person
              :yago.shapes/sh-node-schema-MusicGroup],
   :sh/path  :schema/composer})

(def shape-prop-schema-MusicComposition-schema-iswcCode
  {:db/ident    :yago.shapes/shape-prop-schema-MusicComposition-schema-iswcCode,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/string,
   :sh/maxCount 1,
   :sh/path     :schema/iswcCode,
   :sh/pattern  "^T-[0-9]{3}\\.[0-9]{3}\\.[0-9]{3}-[0-9]$"})

(def shape-prop-schema-MusicComposition-schema-lyricist
  {:db/ident :yago.shapes/shape-prop-schema-MusicComposition-schema-lyricist,
   :rdf/type :sh/PropertyShape,
   :sh/or    [:yago.shapes/sh-node-schema-Person
              :yago.shapes/sh-node-schema-MusicGroup],
   :sh/path  :schema/lyricist})

(def shape-prop-schema-MusicGroup-schema-genre
  {:db/ident :yago.shapes/shape-prop-schema-MusicGroup-schema-genre,
   :rdf/type :sh/PropertyShape,
   :sh/node  :schema/Thing,
   :sh/path  :schema/genre})

(def shape-prop-schema-MusicRelease-schema-duration
  {:db/ident    :yago.shapes/shape-prop-schema-MusicRelease-schema-duration,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/duration,
   :sh/path     :schema/duration})

(def shape-prop-schema-MusicRelease-schema-musicReleaseFormat
  {:db/ident
   :yago.shapes/shape-prop-schema-MusicRelease-schema-musicReleaseFormat,
   :rdf/type :sh/PropertyShape,
   :sh/node :schema/Thing,
   :sh/path :schema/musicReleaseFormat})

(def shape-prop-schema-MusicRelease-schema-recordLabel
  {:db/ident :yago.shapes/shape-prop-schema-MusicRelease-schema-recordLabel,
   :rdf/type :sh/PropertyShape,
   :sh/node  :schema/Organization,
   :sh/path  :schema/recordLabel})

(def shape-prop-schema-MusicRelease-schema-releaseOf
  {:db/ident :yago.shapes/shape-prop-schema-MusicRelease-schema-releaseOf,
   :rdf/type :sh/PropertyShape,
   :sh/node  :schema/MusicAlbum,
   :sh/path  :schema/releaseOf})

(def shape-prop-schema-Organization-schema-award
  {:db/ident :yago.shapes/shape-prop-schema-Organization-schema-award,
   :rdf/type :sh/PropertyShape,
   :sh/node  :schema/Thing,
   :sh/path  :schema/award})

(def shape-prop-schema-Organization-schema-brand
  {:db/ident :yago.shapes/shape-prop-schema-Organization-schema-brand,
   :rdf/type :sh/PropertyShape,
   :sh/or    [:yago.shapes/sh-node-schema-Brand
              :yago.shapes/sh-node-schema-Brand
              :yago.shapes/sh-node-schema-Organization],
   :sh/path  :schema/brand})

(def shape-prop-schema-Organization-schema-dissolutionDate
  {:db/ident :yago.shapes/shape-prop-schema-Organization-schema-dissolutionDate,
   :rdf/type :sh/PropertyShape,
   :sh/maxCount 1,
   :sh/or [:yago.shapes/sh-datatype-xsd-dateTime
           :yago.shapes/sh-datatype-xsd-date
           :yago.shapes/sh-datatype-xsd-gYearMonth
           :yago.shapes/sh-datatype-xsd-gYear],
   :sh/path :schema/dissolutionDate})

(def shape-prop-schema-Organization-schema-duns
  {:db/ident    :yago.shapes/shape-prop-schema-Organization-schema-duns,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/string,
   :sh/maxCount 1,
   :sh/path     :schema/duns,
   :sh/pattern  "^\\d{9}$"})

(def shape-prop-schema-Organization-schema-faxNumber
  {:db/ident    :yago.shapes/shape-prop-schema-Organization-schema-faxNumber,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/string,
   :sh/path     :schema/faxNumber,
   :sh/pattern  "^\\+([17]|[2345689]\\d{1,2})(-\\d{1,14})+$"})

(def shape-prop-schema-Organization-schema-founder
  {:db/ident :yago.shapes/shape-prop-schema-Organization-schema-founder,
   :rdf/type :sh/PropertyShape,
   :sh/node  :schema/Person,
   :sh/path  :schema/founder})

(def shape-prop-schema-Organization-schema-foundingDate
  {:db/ident    :yago.shapes/shape-prop-schema-Organization-schema-foundingDate,
   :rdf/type    :sh/PropertyShape,
   :sh/maxCount 1,
   :sh/or       [:yago.shapes/sh-datatype-xsd-dateTime
                 :yago.shapes/sh-datatype-xsd-date
                 :yago.shapes/sh-datatype-xsd-gYearMonth
                 :yago.shapes/sh-datatype-xsd-gYear],
   :sh/path     :schema/foundingDate})

(def shape-prop-schema-Organization-schema-foundingLocation
  {:db/ident
   :yago.shapes/shape-prop-schema-Organization-schema-foundingLocation,
   :rdf/type :sh/PropertyShape,
   :sh/node :schema/Place,
   :sh/path :schema/foundingLocation})

(def shape-prop-schema-Organization-schema-knowsLanguage
  {:db/ident :yago.shapes/shape-prop-schema-Organization-schema-knowsLanguage,
   :rdf/type :sh/PropertyShape,
   :sh/node  :schema/Language,
   :sh/path  :schema/knowsLanguage})

(def shape-prop-schema-Organization-schema-leiCode
  {:db/ident    :yago.shapes/shape-prop-schema-Organization-schema-leiCode,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/string,
   :sh/maxCount 1,
   :sh/path     :schema/leiCode,
   :sh/pattern  "^[0-9A-Z]{18}[0-9]{2}$"})

(def shape-prop-schema-Organization-schema-location
  {:db/ident :yago.shapes/shape-prop-schema-Organization-schema-location,
   :rdf/type :sh/PropertyShape,
   :sh/node  :schema/Place,
   :sh/path  :schema/location})

(def shape-prop-schema-Organization-schema-logo
  {:db/ident :yago.shapes/shape-prop-schema-Organization-schema-logo,
   :rdf/type :sh/PropertyShape,
   :sh/node  :schema/ImageObject,
   :sh/path  :schema/logo})

(def shape-prop-schema-Organization-schema-memberOf
  {:db/ident :yago.shapes/shape-prop-schema-Organization-schema-memberOf,
   :rdf/type :sh/PropertyShape,
   :sh/node  :schema/Organization,
   :sh/path  :schema/memberOf})

(def shape-prop-schema-Organization-schema-numberOfEmployees
  {:db/ident
   :yago.shapes/shape-prop-schema-Organization-schema-numberOfEmployees,
   :rdf/type :sh/PropertyShape,
   :sh/node :schema/QuantitativeValue,
   :sh/path :schema/numberOfEmployees})

(def shape-prop-schema-Organization-schema-parentOrganization
  {:db/ident
   :yago.shapes/shape-prop-schema-Organization-schema-parentOrganization,
   :rdf/type :sh/PropertyShape,
   :sh/node :schema/Organization,
   :sh/path :schema/parentOrganization})

(def shape-prop-schema-Organization-schema-sponsor
  {:db/ident :yago.shapes/shape-prop-schema-Organization-schema-sponsor,
   :rdf/type :sh/PropertyShape,
   :sh/or    [:yago.shapes/sh-node-schema-Organization
              :yago.shapes/sh-node-schema-Person],
   :sh/path  :schema/sponsor})

(def shape-prop-schema-Organization-schema-subOrganization
  {:db/ident :yago.shapes/shape-prop-schema-Organization-schema-subOrganization,
   :rdf/type :sh/PropertyShape,
   :sh/node  :schema/Organization,
   :sh/path  :schema/subOrganization})

(def shape-prop-schema-Organization-schema-telephone
  {:db/ident    :yago.shapes/shape-prop-schema-Organization-schema-telephone,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/string,
   :sh/path     :schema/telephone,
   :sh/pattern  "^\\+([17]|[2345689]\\d{1,2})(-\\d{1,14})+$"})

(def shape-prop-schema-Person-schema-affiliation
  {:db/ident :yago.shapes/shape-prop-schema-Person-schema-affiliation,
   :rdf/type :sh/PropertyShape,
   :sh/node  :schema/Organization,
   :sh/path  :schema/affiliation})

(def shape-prop-schema-Person-schema-alumniOf
  {:db/ident :yago.shapes/shape-prop-schema-Person-schema-alumniOf,
   :rdf/type :sh/PropertyShape,
   :sh/node  :schema/Organization,
   :sh/path  :schema/alumniOf})

(def shape-prop-schema-Person-schema-award
  {:db/ident :yago.shapes/shape-prop-schema-Person-schema-award,
   :rdf/type :sh/PropertyShape,
   :sh/node  :schema/Thing,
   :sh/path  :schema/award})

(def shape-prop-schema-Person-schema-birthDate
  {:db/ident    :yago.shapes/shape-prop-schema-Person-schema-birthDate,
   :rdf/type    :sh/PropertyShape,
   :sh/maxCount 1,
   :sh/or       [:yago.shapes/sh-datatype-xsd-dateTime
                 :yago.shapes/sh-datatype-xsd-date
                 :yago.shapes/sh-datatype-xsd-gYearMonth
                 :yago.shapes/sh-datatype-xsd-gYear],
   :sh/path     :schema/birthDate})

(def shape-prop-schema-Person-schema-birthPlace
  {:db/ident    :yago.shapes/shape-prop-schema-Person-schema-birthPlace,
   :rdf/type    :sh/PropertyShape,
   :sh/maxCount 1,
   :sh/node     :schema/Place,
   :sh/path     :schema/birthPlace})

(def shape-prop-schema-Person-schema-brand
  {:db/ident :yago.shapes/shape-prop-schema-Person-schema-brand,
   :rdf/type :sh/PropertyShape,
   :sh/or    [:yago.shapes/sh-node-schema-Brand
              :yago.shapes/sh-node-schema-Brand
              :yago.shapes/sh-node-schema-Organization],
   :sh/path  :schema/brand})

(def shape-prop-schema-Person-schema-callSign
  {:db/ident    :yago.shapes/shape-prop-schema-Person-schema-callSign,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/string,
   :sh/path     :schema/callSign})

(def shape-prop-schema-Person-schema-children
  {:db/ident :yago.shapes/shape-prop-schema-Person-schema-children,
   :rdf/type :sh/PropertyShape,
   :sh/node  :schema/Person,
   :sh/path  :schema/children})

(def shape-prop-schema-Person-schema-deathDate
  {:db/ident    :yago.shapes/shape-prop-schema-Person-schema-deathDate,
   :rdf/type    :sh/PropertyShape,
   :sh/maxCount 1,
   :sh/or       [:yago.shapes/sh-datatype-xsd-dateTime
                 :yago.shapes/sh-datatype-xsd-date
                 :yago.shapes/sh-datatype-xsd-gYearMonth
                 :yago.shapes/sh-datatype-xsd-gYear],
   :sh/path     :schema/deathDate})

(def shape-prop-schema-Person-schema-deathPlace
  {:db/ident    :yago.shapes/shape-prop-schema-Person-schema-deathPlace,
   :rdf/type    :sh/PropertyShape,
   :sh/maxCount 1,
   :sh/node     :schema/Place,
   :sh/path     :schema/deathPlace})

(def shape-prop-schema-Person-schema-familyName
  {:db/ident :yago.shapes/shape-prop-schema-Person-schema-familyName,
   :rdf/type :sh/PropertyShape,
   :sh/node  :schema/Thing,
   :sh/path  :schema/familyName})

(def shape-prop-schema-Person-schema-faxNumber
  {:db/ident    :yago.shapes/shape-prop-schema-Person-schema-faxNumber,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/string,
   :sh/path     :schema/faxNumber,
   :sh/pattern  "^\\+([17]|[2345689]\\d{1,2})(-\\d{1,14})+$"})

(def shape-prop-schema-Person-schema-gender
  {:db/ident    :yago.shapes/shape-prop-schema-Person-schema-gender,
   :rdf/type    :sh/PropertyShape,
   :sh/maxCount 1,
   :sh/node     :schema/Thing,
   :sh/path     :schema/gender})

(def shape-prop-schema-Person-schema-givenName
  {:db/ident :yago.shapes/shape-prop-schema-Person-schema-givenName,
   :rdf/type :sh/PropertyShape,
   :sh/node  :schema/Thing,
   :sh/path  :schema/givenName})

(def shape-prop-schema-Person-schema-hasOccupation
  {:db/ident :yago.shapes/shape-prop-schema-Person-schema-hasOccupation,
   :rdf/type :sh/PropertyShape,
   :sh/node  :schema/Occupation,
   :sh/path  :schema/hasOccupation})

(def shape-prop-schema-Person-schema-height
  {:db/ident    :yago.shapes/shape-prop-schema-Person-schema-height,
   :rdf/type    :sh/PropertyShape,
   :sh/maxCount 1,
   :sh/node     :schema/QuantitativeValue,
   :sh/path     :schema/height})

(def shape-prop-schema-Person-schema-homeLocation
  {:db/ident :yago.shapes/shape-prop-schema-Person-schema-homeLocation,
   :rdf/type :sh/PropertyShape,
   :sh/node  :schema/Place,
   :sh/path  :schema/homeLocation})

(def shape-prop-schema-Person-schema-honorificPrefix
  {:db/ident :yago.shapes/shape-prop-schema-Person-schema-honorificPrefix,
   :rdf/type :sh/PropertyShape,
   :sh/node  :schema/Thing,
   :sh/path  :schema/honorificPrefix})

(def shape-prop-schema-Person-schema-knowsLanguage
  {:db/ident :yago.shapes/shape-prop-schema-Person-schema-knowsLanguage,
   :rdf/type :sh/PropertyShape,
   :sh/node  :schema/Language,
   :sh/path  :schema/knowsLanguage})

(def shape-prop-schema-Person-schema-memberOf
  {:db/ident :yago.shapes/shape-prop-schema-Person-schema-memberOf,
   :rdf/type :sh/PropertyShape,
   :sh/node  :schema/Organization,
   :sh/path  :schema/memberOf})

(def shape-prop-schema-Person-schema-nationality
  {:db/ident :yago.shapes/shape-prop-schema-Person-schema-nationality,
   :rdf/type :sh/PropertyShape,
   :sh/node  :schema/Country,
   :sh/path  :schema/nationality})

(def shape-prop-schema-Person-schema-netWorth
  {:db/ident :yago.shapes/shape-prop-schema-Person-schema-netWorth,
   :rdf/type :sh/PropertyShape,
   :sh/node  :schema/QuantitativeValue,
   :sh/path  :schema/netWorth})

(def shape-prop-schema-Person-schema-owns
  {:db/ident :yago.shapes/shape-prop-schema-Person-schema-owns,
   :rdf/type :sh/PropertyShape,
   :sh/node  :schema/Product,
   :sh/path  :schema/owns})

(def shape-prop-schema-Person-schema-parent
  {:db/ident    :yago.shapes/shape-prop-schema-Person-schema-parent,
   :rdf/type    :sh/PropertyShape,
   :sh/maxCount 2,
   :sh/node     :schema/Person,
   :sh/path     :schema/parent})

(def shape-prop-schema-Person-schema-spouse
  {:db/ident :yago.shapes/shape-prop-schema-Person-schema-spouse,
   :rdf/type :sh/PropertyShape,
   :sh/node  :schema/Person,
   :sh/path  :schema/spouse})

(def shape-prop-schema-Person-schema-telephone
  {:db/ident    :yago.shapes/shape-prop-schema-Person-schema-telephone,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/string,
   :sh/path     :schema/telephone,
   :sh/pattern  "^\\+([17]|[2345689]\\d{1,2})(-\\d{1,14})+$"})

(def shape-prop-schema-Person-schema-weight
  {:db/ident :yago.shapes/shape-prop-schema-Person-schema-weight,
   :rdf/type :sh/PropertyShape,
   :sh/node  :schema/QuantitativeValue,
   :sh/path  :schema/weight})

(def shape-prop-schema-Person-schema-worksFor
  {:db/ident :yago.shapes/shape-prop-schema-Person-schema-worksFor,
   :rdf/type :sh/PropertyShape,
   :sh/node  :schema/Person,
   :sh/path  :schema/worksFor})

(def shape-prop-schema-Place-schema-containedInPlace
  {:db/ident :yago.shapes/shape-prop-schema-Place-schema-containedInPlace,
   :rdf/type :sh/PropertyShape,
   :sh/node  :schema/Place,
   :sh/path  :schema/containedInPlace})

(def shape-prop-schema-Place-schema-containsPlace
  {:db/ident :yago.shapes/shape-prop-schema-Place-schema-containsPlace,
   :rdf/type :sh/PropertyShape,
   :sh/node  :schema/Place,
   :sh/path  :schema/containsPlace})

(def shape-prop-schema-Place-schema-elevation
  {:db/ident :yago.shapes/shape-prop-schema-Place-schema-elevation,
   :rdf/type :sh/PropertyShape,
   :sh/node  :schema/QuantitativeValue,
   :sh/path  :schema/elevation})

(def shape-prop-schema-Place-schema-faxNumber
  {:db/ident    :yago.shapes/shape-prop-schema-Place-schema-faxNumber,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/string,
   :sh/path     :schema/faxNumber,
   :sh/pattern  "^\\+([17]|[2345689]\\d{1,2})(-\\d{1,14})+$"})

(def shape-prop-schema-Place-schema-geo
  {:db/ident    :yago.shapes/shape-prop-schema-Place-schema-geo,
   :rdf/type    :sh/PropertyShape,
   :sh/maxCount 1,
   :sh/node     :schema/GeoCoordinates,
   :sh/path     :schema/geo})

(def shape-prop-schema-Place-schema-logo
  {:db/ident :yago.shapes/shape-prop-schema-Place-schema-logo,
   :rdf/type :sh/PropertyShape,
   :sh/node  :schema/ImageObject,
   :sh/path  :schema/logo})

(def shape-prop-schema-Place-schema-telephone
  {:db/ident    :yago.shapes/shape-prop-schema-Place-schema-telephone,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/string,
   :sh/path     :schema/telephone,
   :sh/pattern  "^\\+([17]|[2345689]\\d{1,2})(-\\d{1,14})+$"})

(def shape-prop-schema-Product-schema-award
  {:db/ident :yago.shapes/shape-prop-schema-Product-schema-award,
   :rdf/type :sh/PropertyShape,
   :sh/node  :schema/Thing,
   :sh/path  :schema/award})

(def shape-prop-schema-Product-schema-brand
  {:db/ident :yago.shapes/shape-prop-schema-Product-schema-brand,
   :rdf/type :sh/PropertyShape,
   :sh/or    [:yago.shapes/sh-node-schema-Brand
              :yago.shapes/sh-node-schema-Brand
              :yago.shapes/sh-node-schema-Organization],
   :sh/path  :schema/brand})

(def shape-prop-schema-Product-schema-depth
  {:db/ident :yago.shapes/shape-prop-schema-Product-schema-depth,
   :rdf/type :sh/PropertyShape,
   :sh/node  :schema/QuantitativeValue,
   :sh/path  :schema/depth})

(def shape-prop-schema-Product-schema-gtin
  {:db/ident    :yago.shapes/shape-prop-schema-Product-schema-gtin,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/string,
   :sh/path     :schema/gtin,
   :sh/pattern  "^\\d{12,14}|\\d{8}$"})

(def shape-prop-schema-Product-schema-height
  {:db/ident    :yago.shapes/shape-prop-schema-Product-schema-height,
   :rdf/type    :sh/PropertyShape,
   :sh/maxCount 1,
   :sh/node     :schema/QuantitativeValue,
   :sh/path     :schema/height})

(def shape-prop-schema-Product-schema-logo
  {:db/ident :yago.shapes/shape-prop-schema-Product-schema-logo,
   :rdf/type :sh/PropertyShape,
   :sh/node  :schema/ImageObject,
   :sh/path  :schema/logo})

(def shape-prop-schema-Product-schema-material
  {:db/ident :yago.shapes/shape-prop-schema-Product-schema-material,
   :rdf/type :sh/PropertyShape,
   :sh/node  :schema/Thing,
   :sh/path  :schema/material})

(def shape-prop-schema-Product-schema-weight
  {:db/ident    :yago.shapes/shape-prop-schema-Product-schema-weight,
   :rdf/type    :sh/PropertyShape,
   :sh/maxCount 1,
   :sh/node     :schema/QuantitativeValue,
   :sh/path     :schema/weight})

(def shape-prop-schema-Product-schema-width
  {:db/ident    :yago.shapes/shape-prop-schema-Product-schema-width,
   :rdf/type    :sh/PropertyShape,
   :sh/maxCount 1,
   :sh/node     :schema/QuantitativeValue,
   :sh/path     :schema/width})

(def shape-prop-schema-PublicationIssue-schema-issueNumber
  {:db/ident :yago.shapes/shape-prop-schema-PublicationIssue-schema-issueNumber,
   :rdf/type :sh/PropertyShape,
   :sh/datatype :xsd/string,
   :sh/path :schema/issueNumber})

(def shape-prop-schema-PublicationIssue-schema-pagination
  {:db/ident :yago.shapes/shape-prop-schema-PublicationIssue-schema-pagination,
   :rdf/type :sh/PropertyShape,
   :sh/datatype :xsd/string,
   :sh/path :schema/pagination})

(def shape-prop-schema-PublicationVolume-schema-pagination
  {:db/ident :yago.shapes/shape-prop-schema-PublicationVolume-schema-pagination,
   :rdf/type :sh/PropertyShape,
   :sh/datatype :xsd/string,
   :sh/path :schema/pagination})

(def shape-prop-schema-PublicationVolume-schema-volumeNumber
  {:db/ident
   :yago.shapes/shape-prop-schema-PublicationVolume-schema-volumeNumber,
   :rdf/type :sh/PropertyShape,
   :sh/datatype :xsd/string,
   :sh/path :schema/volumeNumber})

(def shape-prop-schema-QuantitativeValue-schema-maxValue
  {:db/ident :yago.shapes/shape-prop-schema-QuantitativeValue-schema-maxValue,
   :rdf/type :sh/PropertyShape,
   :sh/datatype :xsd/decimal,
   :sh/maxCount 1,
   :sh/path :schema/maxValue})

(def shape-prop-schema-QuantitativeValue-schema-minValue
  {:db/ident :yago.shapes/shape-prop-schema-QuantitativeValue-schema-minValue,
   :rdf/type :sh/PropertyShape,
   :sh/datatype :xsd/decimal,
   :sh/maxCount 1,
   :sh/path :schema/minValue})

(def shape-prop-schema-QuantitativeValue-schema-unitCode
  {:db/ident :yago.shapes/shape-prop-schema-QuantitativeValue-schema-unitCode,
   :rdf/type :sh/PropertyShape,
   :sh/maxCount 1,
   :sh/node :schema/Thing,
   :sh/path :schema/unitCode})

(def shape-prop-schema-QuantitativeValue-schema-value
  {:db/ident    :yago.shapes/shape-prop-schema-QuantitativeValue-schema-value,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/decimal,
   :sh/maxCount 1,
   :sh/path     :schema/value})

(def shape-prop-schema-RadioSeries-schema-actor
  {:db/ident :yago.shapes/shape-prop-schema-RadioSeries-schema-actor,
   :rdf/type :sh/PropertyShape,
   :sh/node  :schema/Person,
   :sh/path  :schema/actor})

(def shape-prop-schema-RadioSeries-schema-director
  {:db/ident :yago.shapes/shape-prop-schema-RadioSeries-schema-director,
   :rdf/type :sh/PropertyShape,
   :sh/node  :schema/Person,
   :sh/path  :schema/director})

(def shape-prop-schema-RadioSeries-schema-musicBy
  {:db/ident :yago.shapes/shape-prop-schema-RadioSeries-schema-musicBy,
   :rdf/type :sh/PropertyShape,
   :sh/or    [:yago.shapes/sh-node-schema-Person
              :yago.shapes/sh-node-schema-MusicGroup],
   :sh/path  :schema/musicBy})

(def shape-prop-schema-RadioSeries-schema-numberOfEpisodes
  {:db/ident :yago.shapes/shape-prop-schema-RadioSeries-schema-numberOfEpisodes,
   :rdf/type :sh/PropertyShape,
   :sh/datatype :xsd/integer,
   :sh/maxCount 1,
   :sh/path :schema/numberOfEpisodes})

(def shape-prop-schema-RadioSeries-schema-numberOfSeasons
  {:db/ident :yago.shapes/shape-prop-schema-RadioSeries-schema-numberOfSeasons,
   :rdf/type :sh/PropertyShape,
   :sh/datatype :xsd/integer,
   :sh/maxCount 1,
   :sh/path :schema/numberOfSeasons})

(def shape-prop-schema-RadioSeries-schema-productionCompany
  {:db/ident
   :yago.shapes/shape-prop-schema-RadioSeries-schema-productionCompany,
   :rdf/type :sh/PropertyShape,
   :sh/node :schema/Organization,
   :sh/path :schema/productionCompany})

(def shape-prop-schema-SoftwareApplication-schema-operatingSystem
  {:db/ident
   :yago.shapes/shape-prop-schema-SoftwareApplication-schema-operatingSystem,
   :rdf/type :sh/PropertyShape,
   :sh/node :schema/SoftwareApplication,
   :sh/path :schema/operatingSystem})

(def shape-prop-schema-SportsEvent-schema-competitor
  {:db/ident :yago.shapes/shape-prop-schema-SportsEvent-schema-competitor,
   :rdf/type :sh/PropertyShape,
   :sh/or    [:yago.shapes/sh-node-schema-Person
              :yago.shapes/sh-node-schema-SportsTeam],
   :sh/path  :schema/competitor})

(def shape-prop-schema-SportsEvent-schema-sport
  {:db/ident :yago.shapes/shape-prop-schema-SportsEvent-schema-sport,
   :rdf/type :sh/PropertyShape,
   :sh/node  :schema/Thing,
   :sh/path  :schema/sport})

(def shape-prop-schema-SportsOrganization-schema-sport
  {:db/ident :yago.shapes/shape-prop-schema-SportsOrganization-schema-sport,
   :rdf/type :sh/PropertyShape,
   :sh/node  :schema/Thing,
   :sh/path  :schema/sport})

(def shape-prop-schema-TVEpisode-schema-countryOfOrigin
  {:db/ident :yago.shapes/shape-prop-schema-TVEpisode-schema-countryOfOrigin,
   :rdf/type :sh/PropertyShape,
   :sh/node  :schema/Country,
   :sh/path  :schema/countryOfOrigin})

(def shape-prop-schema-TVSeason-schema-countryOfOrigin
  {:db/ident :yago.shapes/shape-prop-schema-TVSeason-schema-countryOfOrigin,
   :rdf/type :sh/PropertyShape,
   :sh/node  :schema/Country,
   :sh/path  :schema/countryOfOrigin})

(def shape-prop-schema-TVSeries-schema-actor
  {:db/ident :yago.shapes/shape-prop-schema-TVSeries-schema-actor,
   :rdf/type :sh/PropertyShape,
   :sh/node  :schema/Person,
   :sh/path  :schema/actor})

(def shape-prop-schema-TVSeries-schema-countryOfOrigin
  {:db/ident :yago.shapes/shape-prop-schema-TVSeries-schema-countryOfOrigin,
   :rdf/type :sh/PropertyShape,
   :sh/node  :schema/Country,
   :sh/path  :schema/countryOfOrigin})

(def shape-prop-schema-TVSeries-schema-director
  {:db/ident :yago.shapes/shape-prop-schema-TVSeries-schema-director,
   :rdf/type :sh/PropertyShape,
   :sh/node  :schema/Person,
   :sh/path  :schema/director})

(def shape-prop-schema-TVSeries-schema-musicBy
  {:db/ident :yago.shapes/shape-prop-schema-TVSeries-schema-musicBy,
   :rdf/type :sh/PropertyShape,
   :sh/or    [:yago.shapes/sh-node-schema-Person
              :yago.shapes/sh-node-schema-MusicGroup],
   :sh/path  :schema/musicBy})

(def shape-prop-schema-TVSeries-schema-numberOfEpisodes
  {:db/ident    :yago.shapes/shape-prop-schema-TVSeries-schema-numberOfEpisodes,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/integer,
   :sh/maxCount 1,
   :sh/path     :schema/numberOfEpisodes})

(def shape-prop-schema-TVSeries-schema-numberOfSeasons
  {:db/ident    :yago.shapes/shape-prop-schema-TVSeries-schema-numberOfSeasons,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/integer,
   :sh/maxCount 1,
   :sh/path     :schema/numberOfSeasons})

(def shape-prop-schema-TVSeries-schema-productionCompany
  {:db/ident :yago.shapes/shape-prop-schema-TVSeries-schema-productionCompany,
   :rdf/type :sh/PropertyShape,
   :sh/node  :schema/Organization,
   :sh/path  :schema/productionCompany})

(def shape-prop-schema-Thing-owl-sameAs
  {:db/ident :yago.shapes/shape-prop-schema-Thing-owl-sameAs,
   :rdf/type :sh/PropertyShape,
   :sh/path  :owl/sameAs})

(def shape-prop-schema-Thing-rdfs-comment
  {:db/ident      :yago.shapes/shape-prop-schema-Thing-rdfs-comment,
   :rdf/type      :sh/PropertyShape,
   :sh/datatype   :rdf/langString,
   :sh/path       :rdfs/comment,
   :sh/uniqueLang true})

(def shape-prop-schema-Thing-rdfs-label
  {:db/ident      :yago.shapes/shape-prop-schema-Thing-rdfs-label,
   :rdf/type      :sh/PropertyShape,
   :sh/datatype   :rdf/langString,
   :sh/path       :rdfs/label,
   :sh/uniqueLang true})

(def shape-prop-schema-Thing-schema-alternateName
  {:db/ident    :yago.shapes/shape-prop-schema-Thing-schema-alternateName,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :rdf/langString,
   :sh/path     :schema/alternateName})

(def shape-prop-schema-Thing-schema-image
  {:db/ident :yago.shapes/shape-prop-schema-Thing-schema-image,
   :rdf/type :sh/PropertyShape,
   :sh/node  :schema/ImageObject,
   :sh/path  :schema/image})

(def shape-prop-schema-Thing-schema-sameAs
  {:db/ident    :yago.shapes/shape-prop-schema-Thing-schema-sameAs,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/anyURI,
   :sh/path     :schema/sameAs})

(def shape-prop-schema-Thing-schema-url
  {:db/ident    :yago.shapes/shape-prop-schema-Thing-schema-url,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/anyURI,
   :sh/maxCount 1,
   :sh/path     :schema/url})

(def shape-prop-schema-Vehicle-schema-callSign
  {:db/ident    :yago.shapes/shape-prop-schema-Vehicle-schema-callSign,
   :rdf/type    :sh/PropertyShape,
   :sh/datatype :xsd/string,
   :sh/path     :schema/callSign})

(def shape-prop-schema-VideoGame-schema-actor
  {:db/ident :yago.shapes/shape-prop-schema-VideoGame-schema-actor,
   :rdf/type :sh/PropertyShape,
   :sh/node  :schema/Person,
   :sh/path  :schema/actor})

(def shape-prop-schema-VideoGame-schema-director
  {:db/ident :yago.shapes/shape-prop-schema-VideoGame-schema-director,
   :rdf/type :sh/PropertyShape,
   :sh/node  :schema/Person,
   :sh/path  :schema/director})

(def shape-prop-schema-VideoGame-schema-musicBy
  {:db/ident :yago.shapes/shape-prop-schema-VideoGame-schema-musicBy,
   :rdf/type :sh/PropertyShape,
   :sh/or    [:yago.shapes/sh-node-schema-Person
              :yago.shapes/sh-node-schema-MusicGroup],
   :sh/path  :schema/musicBy})

(def shape-prop-schema-VideoGameSeries-schema-director
  {:db/ident :yago.shapes/shape-prop-schema-VideoGameSeries-schema-director,
   :rdf/type :sh/PropertyShape,
   :sh/node  :schema/Person,
   :sh/path  :schema/director})

(def shape-prop-schema-VideoGameSeries-schema-musicBy
  {:db/ident :yago.shapes/shape-prop-schema-VideoGameSeries-schema-musicBy,
   :rdf/type :sh/PropertyShape,
   :sh/or    [:yago.shapes/sh-node-schema-Person
              :yago.shapes/sh-node-schema-MusicGroup],
   :sh/path  :schema/musicBy})

(def shape-prop-schema-VideoGameSeries-schema-numberOfEpisodes
  {:db/ident
   :yago.shapes/shape-prop-schema-VideoGameSeries-schema-numberOfEpisodes,
   :rdf/type :sh/PropertyShape,
   :sh/datatype :xsd/integer,
   :sh/maxCount 1,
   :sh/path :schema/numberOfEpisodes})

(def shape-prop-schema-VideoGameSeries-schema-numberOfSeasons
  {:db/ident
   :yago.shapes/shape-prop-schema-VideoGameSeries-schema-numberOfSeasons,
   :rdf/type :sh/PropertyShape,
   :sh/datatype :xsd/integer,
   :sh/maxCount 1,
   :sh/path :schema/numberOfSeasons})

(def shape-prop-schema-VideoGameSeries-schema-productionCompany
  {:db/ident
   :yago.shapes/shape-prop-schema-VideoGameSeries-schema-productionCompany,
   :rdf/type :sh/PropertyShape,
   :sh/node :schema/Organization,
   :sh/path :schema/productionCompany})

(def shape-prop-schema-VisualArtwork-schema-colorist
  {:db/ident :yago.shapes/shape-prop-schema-VisualArtwork-schema-colorist,
   :rdf/type :sh/PropertyShape,
   :sh/node  :schema/Person,
   :sh/path  :schema/colorist})

(def shape-prop-schema-VisualArtwork-schema-depth
  {:db/ident :yago.shapes/shape-prop-schema-VisualArtwork-schema-depth,
   :rdf/type :sh/PropertyShape,
   :sh/node  :schema/QuantitativeValue,
   :sh/path  :schema/depth})

(def shape-prop-schema-VisualArtwork-schema-height
  {:db/ident    :yago.shapes/shape-prop-schema-VisualArtwork-schema-height,
   :rdf/type    :sh/PropertyShape,
   :sh/maxCount 1,
   :sh/node     :schema/QuantitativeValue,
   :sh/path     :schema/height})

(def shape-prop-schema-VisualArtwork-schema-width
  {:db/ident    :yago.shapes/shape-prop-schema-VisualArtwork-schema-width,
   :rdf/type    :sh/PropertyShape,
   :sh/maxCount 1,
   :sh/node     :schema/QuantitativeValue,
   :sh/path     :schema/width})

(def ^{:private true} BioChemEntity
  {:db/ident :bioschema/BioChemEntity,
   :rdf/type :sh/NodeShape,
   :sh/property
   [:yago.shapes/shape-prop-bioschema-BioChemEntity-bioschema-isLocatedInSubcellularLocation
    :yago.shapes/shape-prop-bioschema-BioChemEntity-bioschema-hasMolecularFunction
    :yago.shapes/shape-prop-bioschema-BioChemEntity-bioschema-bioChemInteraction
    :yago.shapes/shape-prop-bioschema-BioChemEntity-bioschema-isInvolvedInBiologicalProcess
    :yago.shapes/shape-prop-bioschema-BioChemEntity-bioschema-isEncodedByBioChemEntity],
   :sh/targetClass :bioschema/BioChemEntity})

(def ^{:private true} Gene
  {:db/ident :bioschema/Gene,
   :rdf/type :sh/NodeShape,
   :sh/property
   [:yago.shapes/shape-prop-bioschema-Gene-bioschema-encodesBioChemEntity
    :yago.shapes/shape-prop-bioschema-Gene-bioschema-expressedIn],
   :sh/targetClass :bioschema/Gene})

(def ^{:private true} MolecularEntity
  {:db/ident :bioschema/MolecularEntity,
   :rdf/type :sh/NodeShape,
   :sh/property
   [:yago.shapes/shape-prop-bioschema-MolecularEntity-bioschema-inChIKey
    :yago.shapes/shape-prop-bioschema-MolecularEntity-bioschema-inChI
    :yago.shapes/shape-prop-bioschema-MolecularEntity-bioschema-molecularFormula
    :yago.shapes/shape-prop-bioschema-MolecularEntity-bioschema-smiles],
   :sh/targetClass :bioschema/MolecularEntity})

(def ^{:private true} Taxon
  {:db/ident :bioschema/Taxon,
   :rdf/type :sh/NodeShape,
   :sh/property [:yago.shapes/shape-prop-bioschema-Taxon-bioschema-parentTaxon
                 :yago.shapes/shape-prop-bioschema-Taxon-bioschema-taxonRank],
   :sh/targetClass :bioschema/Taxon})

(def ^{:private true} Airline
  {:db/ident       :schema/Airline,
   :rdf/type       :sh/NodeShape,
   :sh/property    [:yago.shapes/shape-prop-schema-Airline-schema-icaoCode
                    :yago.shapes/shape-prop-schema-Airline-schema-iataCode],
   :sh/targetClass :schema/Airline})

(def ^{:private true} Airport
  {:db/ident       :schema/Airport,
   :rdf/type       :sh/NodeShape,
   :sh/property    [:yago.shapes/shape-prop-schema-Airport-schema-iataCode
                    :yago.shapes/shape-prop-schema-Airport-schema-icaoCode],
   :sh/targetClass :schema/Airport})

(def ^{:private true} AnatomicalStructure
  {:db/ident :schema/AnatomicalStructure,
   :rdf/type :sh/NodeShape,
   :sh/property
   :yago.shapes/shape-prop-schema-AnatomicalStructure-schema-connectedTo,
   :sh/targetClass :schema/AnatomicalStructure})

(def ^{:private true} Article
  {:db/ident       :schema/Article,
   :rdf/type       :sh/NodeShape,
   :sh/property    :yago.shapes/shape-prop-schema-Article-schema-pagination,
   :sh/targetClass :schema/Article})

(def ^{:private true} Book
  {:db/ident       :schema/Book,
   :rdf/type       :sh/NodeShape,
   :sh/property    [:yago.shapes/shape-prop-schema-Book-schema-illustrator
                    :yago.shapes/shape-prop-schema-Book-schema-isbn
                    :yago.shapes/shape-prop-schema-Book-schema-numberOfPages],
   :sh/targetClass :schema/Book})

(def ^{:private true} Brand
  {:db/ident       :schema/Brand,
   :rdf/type       :sh/NodeShape,
   :sh/property    :yago.shapes/shape-prop-schema-Brand-schema-logo,
   :sh/targetClass :schema/Brand})

(def ^{:private true} BroadcastChannel
  {:db/ident :schema/BroadcastChannel,
   :rdf/type :sh/NodeShape,
   :sh/property
   :yago.shapes/shape-prop-schema-BroadcastChannel-schema-broadcastChannelId,
   :sh/targetClass :schema/BroadcastChannel})

(def ^{:private true} BroadcastService
  {:db/ident :schema/BroadcastService,
   :rdf/type :sh/NodeShape,
   :sh/property :yago.shapes/shape-prop-schema-BroadcastService-schema-callSign,
   :sh/targetClass :schema/BroadcastService})

(def ^{:private true} City
  {:db/ident       :schema/City,
   :rdf/type       :sh/NodeShape,
   :sh/property    :yago.shapes/shape-prop-schema-City-schema-iataCode,
   :sh/targetClass :schema/City})

(def ^{:private true} ComicStory
  {:db/ident       :schema/ComicStory,
   :rdf/type       :sh/NodeShape,
   :sh/property    :yago.shapes/shape-prop-schema-ComicStory-schema-colorist,
   :sh/targetClass :schema/ComicStory})

(def ^{:private true} CreativeWork
  {:db/ident :schema/CreativeWork,
   :rdf/type :sh/NodeShape,
   :sh/property
   [:yago.shapes/shape-prop-schema-CreativeWork-schema-creator
    :yago.shapes/shape-prop-schema-CreativeWork-schema-producer
    :yago.shapes/shape-prop-schema-CreativeWork-schema-genre
    :yago.shapes/shape-prop-schema-CreativeWork-schema-translator
    :yago.shapes/shape-prop-schema-CreativeWork-schema-datePublished
    :yago.shapes/shape-prop-schema-CreativeWork-schema-isBasedOn
    :yago.shapes/shape-prop-schema-CreativeWork-schema-exampleOfWork
    :yago.shapes/shape-prop-schema-CreativeWork-schema-license
    :yago.shapes/shape-prop-schema-CreativeWork-schema-contentLocation
    :yago.shapes/shape-prop-schema-CreativeWork-schema-provider
    :yago.shapes/shape-prop-schema-CreativeWork-schema-award
    :yago.shapes/shape-prop-schema-CreativeWork-schema-author
    :yago.shapes/shape-prop-schema-CreativeWork-schema-publisher
    :yago.shapes/shape-prop-schema-CreativeWork-schema-workExample
    :yago.shapes/shape-prop-schema-CreativeWork-schema-isPartOf
    :yago.shapes/shape-prop-schema-CreativeWork-schema-sponsor
    :yago.shapes/shape-prop-schema-CreativeWork-schema-encodingFormat
    :yago.shapes/shape-prop-schema-CreativeWork-schema-material
    :yago.shapes/shape-prop-schema-CreativeWork-schema-inLanguage
    :yago.shapes/shape-prop-schema-CreativeWork-schema-character
    :yago.shapes/shape-prop-schema-CreativeWork-schema-position
    :yago.shapes/shape-prop-schema-CreativeWork-schema-dateCreated
    :yago.shapes/shape-prop-schema-CreativeWork-schema-copyrightHolder
    :yago.shapes/shape-prop-schema-CreativeWork-schema-hasPart
    :yago.shapes/shape-prop-schema-CreativeWork-schema-locationCreated
    :yago.shapes/shape-prop-schema-CreativeWork-schema-contributor
    :yago.shapes/shape-prop-schema-CreativeWork-schema-about
    :yago.shapes/shape-prop-schema-CreativeWork-schema-contentRating
    :yago.shapes/shape-prop-schema-CreativeWork-schema-citation
    :yago.shapes/shape-prop-schema-CreativeWork-schema-editor],
   :sh/targetClass :schema/CreativeWork})

(def ^{:private true} CreativeWorkSeason
  {:db/ident :schema/CreativeWorkSeason,
   :rdf/type :sh/NodeShape,
   :sh/property
   [:yago.shapes/shape-prop-schema-CreativeWorkSeason-schema-partOfSeries
    :yago.shapes/shape-prop-schema-CreativeWorkSeason-schema-actor
    :yago.shapes/shape-prop-schema-CreativeWorkSeason-schema-productionCompany
    :yago.shapes/shape-prop-schema-CreativeWorkSeason-schema-numberOfEpisodes],
   :sh/targetClass :schema/CreativeWorkSeason})

(def ^{:private true} CreativeWorkSeries
  {:db/ident :schema/CreativeWorkSeries,
   :rdf/type :sh/NodeShape,
   :sh/property :yago.shapes/shape-prop-schema-CreativeWorkSeries-schema-issn,
   :sh/targetClass :schema/CreativeWorkSeries})

(def ^{:private true} Episode
  {:db/ident :schema/Episode,
   :rdf/type :sh/NodeShape,
   :sh/property [:yago.shapes/shape-prop-schema-Episode-schema-musicBy
                 :yago.shapes/shape-prop-schema-Episode-schema-partOfSeries
                 :yago.shapes/shape-prop-schema-Episode-schema-partOfSeason
                 :yago.shapes/shape-prop-schema-Episode-schema-actor
                 :yago.shapes/shape-prop-schema-Episode-schema-productionCompany
                 :yago.shapes/shape-prop-schema-Episode-schema-director],
   :sh/targetClass :schema/Episode})

(def ^{:private true} Event
  {:db/ident       :schema/Event,
   :rdf/type       :sh/NodeShape,
   :sh/property    [:yago.shapes/shape-prop-schema-Event-schema-composer
                    :yago.shapes/shape-prop-schema-Event-schema-translator
                    :yago.shapes/shape-prop-schema-Event-schema-organizer
                    :yago.shapes/shape-prop-schema-Event-schema-superEvent
                    :yago.shapes/shape-prop-schema-Event-schema-contributor
                    :yago.shapes/shape-prop-schema-Event-schema-sponsor
                    :yago.shapes/shape-prop-schema-Event-schema-duration
                    :yago.shapes/shape-prop-schema-Event-schema-startDate
                    :yago.shapes/shape-prop-schema-Event-schema-location
                    :yago.shapes/shape-prop-schema-Event-schema-subEvent
                    :yago.shapes/shape-prop-schema-Event-schema-about
                    :yago.shapes/shape-prop-schema-Event-schema-endDate],
   :sh/targetClass :schema/Event})

(def ^{:private true} FoodEstablishment
  {:db/ident :schema/FoodEstablishment,
   :rdf/type :sh/NodeShape,
   :sh/property
   :yago.shapes/shape-prop-schema-FoodEstablishment-schema-servesCuisine,
   :sh/targetClass :schema/FoodEstablishment})

(def ^{:private true} GeoCoordinates
  {:db/ident :schema/GeoCoordinates,
   :rdf/type :sh/NodeShape,
   :sh/property [:yago.shapes/shape-prop-schema-GeoCoordinates-schema-longitude
                 :yago.shapes/shape-prop-schema-GeoCoordinates-schema-latitude],
   :sh/targetClass :schema/GeoCoordinates})

(def ^{:private true} MedicalCondition
  {:db/ident :schema/MedicalCondition,
   :rdf/type :sh/NodeShape,
   :sh/property
   [:yago.shapes/shape-prop-schema-MedicalCondition-schema-signOrSymptom
    :yago.shapes/shape-prop-schema-MedicalCondition-schema-riskFactor
    :yago.shapes/shape-prop-schema-MedicalCondition-schema-possibleTreatment],
   :sh/targetClass :schema/MedicalCondition})

(def ^{:private true} MedicalEntity
  {:db/ident :schema/MedicalEntity,
   :rdf/type :sh/NodeShape,
   :sh/property
   [:yago.shapes/shape-prop-schema-MedicalEntity-schema-relevantSpecialty
    :yago.shapes/shape-prop-schema-MedicalEntity-schema-legalStatus],
   :sh/targetClass :schema/MedicalEntity})

(def ^{:private true} MedicalSignOrSymptom
  {:db/ident :schema/MedicalSignOrSymptom,
   :rdf/type :sh/NodeShape,
   :sh/property
   :yago.shapes/shape-prop-schema-MedicalSignOrSymptom-schema-possibleTreatment,
   :sh/targetClass :schema/MedicalSignOrSymptom})

(def ^{:private true} Movie
  {:db/ident :schema/Movie,
   :rdf/type :sh/NodeShape,
   :sh/property [:yago.shapes/shape-prop-schema-Movie-schema-musicBy
                 :yago.shapes/shape-prop-schema-Movie-schema-countryOfOrigin
                 :yago.shapes/shape-prop-schema-Movie-schema-productionCompany
                 :yago.shapes/shape-prop-schema-Movie-schema-duration
                 :yago.shapes/shape-prop-schema-Movie-schema-director
                 :yago.shapes/shape-prop-schema-Movie-schema-actor],
   :sh/targetClass :schema/Movie})

(def ^{:private true} MovieSeries
  {:db/ident :schema/MovieSeries,
   :rdf/type :sh/NodeShape,
   :sh/property
   [:yago.shapes/shape-prop-schema-MovieSeries-schema-musicBy
    :yago.shapes/shape-prop-schema-MovieSeries-schema-director
    :yago.shapes/shape-prop-schema-MovieSeries-schema-actor
    :yago.shapes/shape-prop-schema-MovieSeries-schema-productionCompany],
   :sh/targetClass :schema/MovieSeries})

(def ^{:private true} MusicAlbum
  {:db/ident       :schema/MusicAlbum,
   :rdf/type       :sh/NodeShape,
   :sh/property    :yago.shapes/shape-prop-schema-MusicAlbum-schema-byArtist,
   :sh/targetClass :schema/MusicAlbum})

(def ^{:private true} MusicComposition
  {:db/ident :schema/MusicComposition,
   :rdf/type :sh/NodeShape,
   :sh/property
   [:yago.shapes/shape-prop-schema-MusicComposition-schema-iswcCode
    :yago.shapes/shape-prop-schema-MusicComposition-schema-lyricist
    :yago.shapes/shape-prop-schema-MusicComposition-schema-composer],
   :sh/targetClass :schema/MusicComposition})

(def ^{:private true} MusicGroup
  {:db/ident       :schema/MusicGroup,
   :rdf/type       :sh/NodeShape,
   :sh/property    :yago.shapes/shape-prop-schema-MusicGroup-schema-genre,
   :sh/targetClass :schema/MusicGroup})

(def ^{:private true} MusicRelease
  {:db/ident :schema/MusicRelease,
   :rdf/type :sh/NodeShape,
   :sh/property
   [:yago.shapes/shape-prop-schema-MusicRelease-schema-releaseOf
    :yago.shapes/shape-prop-schema-MusicRelease-schema-recordLabel
    :yago.shapes/shape-prop-schema-MusicRelease-schema-duration
    :yago.shapes/shape-prop-schema-MusicRelease-schema-musicReleaseFormat],
   :sh/targetClass :schema/MusicRelease})

(def ^{:private true} Organization
  {:db/ident :schema/Organization,
   :rdf/type :sh/NodeShape,
   :sh/property
   [:yago.shapes/shape-prop-schema-Organization-schema-memberOf
    :yago.shapes/shape-prop-schema-Organization-schema-subOrganization
    :yago.shapes/shape-prop-schema-Organization-schema-leiCode
    :yago.shapes/shape-prop-schema-Organization-schema-knowsLanguage
    :yago.shapes/shape-prop-schema-Organization-schema-parentOrganization
    :yago.shapes/shape-prop-schema-Organization-schema-sponsor
    :yago.shapes/shape-prop-schema-Organization-schema-telephone
    :yago.shapes/shape-prop-schema-Organization-schema-foundingLocation
    :yago.shapes/shape-prop-schema-Organization-schema-logo
    :yago.shapes/shape-prop-schema-Organization-schema-faxNumber
    :yago.shapes/shape-prop-schema-Organization-schema-location
    :yago.shapes/shape-prop-schema-Organization-schema-dissolutionDate
    :yago.shapes/shape-prop-schema-Organization-schema-duns
    :yago.shapes/shape-prop-schema-Organization-schema-award
    :yago.shapes/shape-prop-schema-Organization-schema-foundingDate
    :yago.shapes/shape-prop-schema-Organization-schema-brand
    :yago.shapes/shape-prop-schema-Organization-schema-founder
    :yago.shapes/shape-prop-schema-Organization-schema-numberOfEmployees],
   :sh/targetClass :schema/Organization})

(def ^{:private true} Person
  {:db/ident       :schema/Person,
   :rdf/type       :sh/NodeShape,
   :sh/property    [:yago.shapes/shape-prop-schema-Person-schema-award
                    :yago.shapes/shape-prop-schema-Person-schema-nationality
                    :yago.shapes/shape-prop-schema-Person-schema-height
                    :yago.shapes/shape-prop-schema-Person-schema-birthDate
                    :yago.shapes/shape-prop-schema-Person-schema-givenName
                    :yago.shapes/shape-prop-schema-Person-schema-birthPlace
                    :yago.shapes/shape-prop-schema-Person-schema-honorificPrefix
                    :yago.shapes/shape-prop-schema-Person-schema-knowsLanguage
                    :yago.shapes/shape-prop-schema-Person-schema-owns
                    :yago.shapes/shape-prop-schema-Person-schema-weight
                    :yago.shapes/shape-prop-schema-Person-schema-callSign
                    :yago.shapes/shape-prop-schema-Person-schema-homeLocation
                    :yago.shapes/shape-prop-schema-Person-schema-spouse
                    :yago.shapes/shape-prop-schema-Person-schema-hasOccupation
                    :yago.shapes/shape-prop-schema-Person-schema-deathDate
                    :yago.shapes/shape-prop-schema-Person-schema-alumniOf
                    :yago.shapes/shape-prop-schema-Person-schema-deathPlace
                    :yago.shapes/shape-prop-schema-Person-schema-children
                    :yago.shapes/shape-prop-schema-Person-schema-telephone
                    :yago.shapes/shape-prop-schema-Person-schema-memberOf
                    :yago.shapes/shape-prop-schema-Person-schema-brand
                    :yago.shapes/shape-prop-schema-Person-schema-worksFor
                    :yago.shapes/shape-prop-schema-Person-schema-parent
                    :yago.shapes/shape-prop-schema-Person-schema-familyName
                    :yago.shapes/shape-prop-schema-Person-schema-gender
                    :yago.shapes/shape-prop-schema-Person-schema-affiliation
                    :yago.shapes/shape-prop-schema-Person-schema-netWorth
                    :yago.shapes/shape-prop-schema-Person-schema-faxNumber],
   :sh/targetClass :schema/Person})

(def ^{:private true} Place
  {:db/ident       :schema/Place,
   :rdf/type       :sh/NodeShape,
   :sh/property    [:yago.shapes/shape-prop-schema-Place-schema-logo
                    :yago.shapes/shape-prop-schema-Place-schema-containsPlace
                    :yago.shapes/shape-prop-schema-Place-schema-telephone
                    :yago.shapes/shape-prop-schema-Place-schema-faxNumber
                    :yago.shapes/shape-prop-schema-Place-schema-containedInPlace
                    :yago.shapes/shape-prop-schema-Place-schema-geo
                    :yago.shapes/shape-prop-schema-Place-schema-elevation],
   :sh/targetClass :schema/Place})

(def ^{:private true} Product
  {:db/ident       :schema/Product,
   :rdf/type       :sh/NodeShape,
   :sh/property    [:yago.shapes/shape-prop-schema-Product-schema-award
                    :yago.shapes/shape-prop-schema-Product-schema-height
                    :yago.shapes/shape-prop-schema-Product-schema-weight
                    :yago.shapes/shape-prop-schema-Product-schema-logo
                    :yago.shapes/shape-prop-schema-Product-schema-gtin
                    :yago.shapes/shape-prop-schema-Product-schema-material
                    :yago.shapes/shape-prop-schema-Product-schema-depth
                    :yago.shapes/shape-prop-schema-Product-schema-width
                    :yago.shapes/shape-prop-schema-Product-schema-brand],
   :sh/targetClass :schema/Product})

(def ^{:private true} PublicationIssue
  {:db/ident :schema/PublicationIssue,
   :rdf/type :sh/NodeShape,
   :sh/property
   [:yago.shapes/shape-prop-schema-PublicationIssue-schema-pagination
    :yago.shapes/shape-prop-schema-PublicationIssue-schema-issueNumber],
   :sh/targetClass :schema/PublicationIssue})

(def ^{:private true} PublicationVolume
  {:db/ident :schema/PublicationVolume,
   :rdf/type :sh/NodeShape,
   :sh/property
   [:yago.shapes/shape-prop-schema-PublicationVolume-schema-volumeNumber
    :yago.shapes/shape-prop-schema-PublicationVolume-schema-pagination],
   :sh/targetClass :schema/PublicationVolume})

(def ^{:private true} QuantitativeValue
  {:db/ident :schema/QuantitativeValue,
   :rdf/type :sh/NodeShape,
   :sh/property
   [:yago.shapes/shape-prop-schema-QuantitativeValue-schema-unitCode
    :yago.shapes/shape-prop-schema-QuantitativeValue-schema-maxValue
    :yago.shapes/shape-prop-schema-QuantitativeValue-schema-value
    :yago.shapes/shape-prop-schema-QuantitativeValue-schema-minValue],
   :sh/targetClass :schema/QuantitativeValue})

(def ^{:private true} RadioSeries
  {:db/ident :schema/RadioSeries,
   :rdf/type :sh/NodeShape,
   :sh/property
   [:yago.shapes/shape-prop-schema-RadioSeries-schema-productionCompany
    :yago.shapes/shape-prop-schema-RadioSeries-schema-numberOfEpisodes
    :yago.shapes/shape-prop-schema-RadioSeries-schema-musicBy
    :yago.shapes/shape-prop-schema-RadioSeries-schema-director
    :yago.shapes/shape-prop-schema-RadioSeries-schema-numberOfSeasons
    :yago.shapes/shape-prop-schema-RadioSeries-schema-actor],
   :sh/targetClass :schema/RadioSeries})

(def ^{:private true} SoftwareApplication
  {:db/ident :schema/SoftwareApplication,
   :rdf/type :sh/NodeShape,
   :sh/property
   :yago.shapes/shape-prop-schema-SoftwareApplication-schema-operatingSystem,
   :sh/targetClass :schema/SoftwareApplication})

(def ^{:private true} SportsEvent
  {:db/ident       :schema/SportsEvent,
   :rdf/type       :sh/NodeShape,
   :sh/property    [:yago.shapes/shape-prop-schema-SportsEvent-schema-competitor
                    :yago.shapes/shape-prop-schema-SportsEvent-schema-sport],
   :sh/targetClass :schema/SportsEvent})

(def ^{:private true} SportsOrganization
  {:db/ident :schema/SportsOrganization,
   :rdf/type :sh/NodeShape,
   :sh/property :yago.shapes/shape-prop-schema-SportsOrganization-schema-sport,
   :sh/targetClass :schema/SportsOrganization})

(def ^{:private true} TVEpisode
  {:db/ident :schema/TVEpisode,
   :rdf/type :sh/NodeShape,
   :sh/property :yago.shapes/shape-prop-schema-TVEpisode-schema-countryOfOrigin,
   :sh/targetClass :schema/TVEpisode})

(def ^{:private true} TVSeason
  {:db/ident :schema/TVSeason,
   :rdf/type :sh/NodeShape,
   :sh/property :yago.shapes/shape-prop-schema-TVSeason-schema-countryOfOrigin,
   :sh/targetClass :schema/TVSeason})

(def ^{:private true} TVSeries
  {:db/ident :schema/TVSeries,
   :rdf/type :sh/NodeShape,
   :sh/property
   [:yago.shapes/shape-prop-schema-TVSeries-schema-musicBy
    :yago.shapes/shape-prop-schema-TVSeries-schema-numberOfEpisodes
    :yago.shapes/shape-prop-schema-TVSeries-schema-countryOfOrigin
    :yago.shapes/shape-prop-schema-TVSeries-schema-productionCompany
    :yago.shapes/shape-prop-schema-TVSeries-schema-actor
    :yago.shapes/shape-prop-schema-TVSeries-schema-director
    :yago.shapes/shape-prop-schema-TVSeries-schema-numberOfSeasons],
   :sh/targetClass :schema/TVSeries})

(def ^{:private true} Thing
  {:db/ident       :schema/Thing,
   :rdf/type       :sh/NodeShape,
   :sh/property    [:yago.shapes/shape-prop-schema-Thing-rdfs-label
                    :yago.shapes/shape-prop-schema-Thing-schema-alternateName
                    :yago.shapes/shape-prop-schema-Thing-owl-sameAs
                    :yago.shapes/shape-prop-schema-Thing-schema-sameAs
                    :yago.shapes/shape-prop-schema-Thing-rdfs-comment
                    :yago.shapes/shape-prop-schema-Thing-schema-image
                    :yago.shapes/shape-prop-schema-Thing-schema-url],
   :sh/targetClass :schema/Thing})

(def ^{:private true} Vehicle
  {:db/ident       :schema/Vehicle,
   :rdf/type       :sh/NodeShape,
   :sh/property    :yago.shapes/shape-prop-schema-Vehicle-schema-callSign,
   :sh/targetClass :schema/Vehicle})

(def ^{:private true} VideoGame
  {:db/ident       :schema/VideoGame,
   :rdf/type       :sh/NodeShape,
   :sh/property    [:yago.shapes/shape-prop-schema-VideoGame-schema-actor
                    :yago.shapes/shape-prop-schema-VideoGame-schema-director
                    :yago.shapes/shape-prop-schema-VideoGame-schema-musicBy],
   :sh/targetClass :schema/VideoGame})

(def ^{:private true} VideoGameSeries
  {:db/ident :schema/VideoGameSeries,
   :rdf/type :sh/NodeShape,
   :sh/property
   [:yago.shapes/shape-prop-schema-VideoGameSeries-schema-musicBy
    :yago.shapes/shape-prop-schema-VideoGameSeries-schema-numberOfSeasons
    :yago.shapes/shape-prop-schema-VideoGameSeries-schema-director
    :yago.shapes/shape-prop-schema-VideoGameSeries-schema-numberOfEpisodes
    :yago.shapes/shape-prop-schema-VideoGameSeries-schema-productionCompany],
   :sh/targetClass :schema/VideoGameSeries})

(def ^{:private true} VisualArtwork
  {:db/ident       :schema/VisualArtwork,
   :rdf/type       :sh/NodeShape,
   :sh/property    [:yago.shapes/shape-prop-schema-VisualArtwork-schema-colorist
                    :yago.shapes/shape-prop-schema-VisualArtwork-schema-height
                    :yago.shapes/shape-prop-schema-VisualArtwork-schema-depth
                    :yago.shapes/shape-prop-schema-VisualArtwork-schema-width],
   :sh/targetClass :schema/VisualArtwork})