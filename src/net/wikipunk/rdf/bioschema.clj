(ns net.wikipunk.rdf.bioschema
  "http://bioschemas.org/"
  {:dcat/downloadURL  "/home/adrian/src/web3/yago4/src/data/bioschemas.ttl",
   :rdf/ns-prefix-map {"bioschema" "http://bioschemas.org/",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "schema" "http://schema.org/",
                       "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type          :rdfa/PrefixMapping,
   :rdfa/prefix       "bioschema",
   :rdfa/uri          "http://bioschemas.org/"})

(def BioChemEntity
  "Any biological, chemical, or biochemical thing. For example: a protein; a gene; a chemical; a synthetic chemical."
  {:db/ident :bioschema/BioChemEntity,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Any biological, chemical, or biochemical thing. For example: a protein; a gene; a chemical; a synthetic chemical."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "biology chemistry entity"},
   :rdfs/subClassOf :schema/Thing})

(def BioSample
  "A biological material entity that is representative of a whole."
  {:db/ident :bioschema/BioSample,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A biological material entity that is representative of a whole."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "biological sample"},
   :rdfs/subClassOf :bioschema/BioChemEntity})

(def ChemicalSubstance
  "A chemical substance."
  {:db/ident        :bioschema/ChemicalSubstance,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    {:rdf/language "en",
                     :rdf/value    "A chemical substance."},
   :rdfs/label      {:rdf/language "en",
                     :rdf/value    "chemical substance"},
   :rdfs/subClassOf :bioschema/BioChemEntity})

(def Gene
  "A discrete unit of inheritance which affects one or more biological traits ."
  {:db/ident :bioschema/Gene,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A discrete unit of inheritance which affects one or more biological traits ."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "gene"},
   :rdfs/subClassOf :bioschema/BioChemEntity})

(def MolecularEntity
  "Any constitutionally or isotopically distinct atom, molecule, ion, ion pair, radical, radical ion, complex, conformer etc., identifiable as a separately distinguishable entity."
  {:db/ident :bioschema/MolecularEntity,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Any constitutionally or isotopically distinct atom, molecule, ion, ion pair, radical, radical ion, complex, conformer etc., identifiable as a separately distinguishable entity."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "molecular entity"},
   :rdfs/subClassOf :bioschema/BioChemEntity})

(def Protein
  "Protein is here used in its widest possible definition, as classes of amino acid based molecules. Amyloid-beta Protein in human (UniProt P05067), eukaryota (e.g. an OrthoDB group) or even a single molecule that one can point to are all of type schema:Protein. A protein can thus be a subclass of another protein, e.g. schema:Protein as a UniProt record can have multiple isoforms inside it which would also be schema:Protein. They can be imagined, synthetic, hypothetical or naturally occurring."
  {:db/ident :bioschema/Protein,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Protein is here used in its widest possible definition, as classes of amino acid based molecules. Amyloid-beta Protein in human (UniProt P05067), eukaryota (e.g. an OrthoDB group) or even a single molecule that one can point to are all of type schema:Protein. A protein can thus be a subclass of another protein, e.g. schema:Protein as a UniProt record can have multiple isoforms inside it which would also be schema:Protein. They can be imagined, synthetic, hypothetical or naturally occurring."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "protein"},
   :rdfs/subClassOf :bioschema/BioChemEntity})

(def Taxon
  "A set of organisms asserted to represent a natural cohesive biological unit."
  {:db/ident :bioschema/Taxon,
   :rdf/type :rdfs/Class,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "A set of organisms asserted to represent a natural cohesive biological unit."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "taxon"},
   :rdfs/subClassOf :schema/Thing})

(def alternativeOf
  {:db/ident :bioschema/alternativeOf,
   :rdf/type :rdf/Property})

(def associatedDisease
  {:db/ident :bioschema/associatedDisease,
   :rdf/type :rdf/Property})

(def bioChemInteraction
  {:db/ident :bioschema/bioChemInteraction,
   :rdf/type :rdf/Property})

(def bioChemSimilarity
  {:db/ident :bioschema/bioChemSimilarity,
   :rdf/type :rdf/Property})

(def biogicalRole
  {:db/ident :bioschema/biogicalRole,
   :rdf/type :rdf/Property})

(def chemicalRole
  {:db/ident :bioschema/chemicalRole,
   :rdf/type :rdf/Property})

(def childTaxon
  {:db/ident :bioschema/childTaxon,
   :rdf/type :rdf/Property})

(def collector
  {:db/ident :bioschema/collector,
   :rdf/type :rdf/Property})

(def custodian
  {:db/ident :bioschema/custodian,
   :rdf/type :rdf/Property})

(def encodesBioChemEntity
  {:db/ident         :bioschema/encodesBioChemEntity,
   :rdf/type         :rdf/Property,
   :schema/inverseOf :bioschema/isEncodedByBioChemEntity})

(def expressedIn
  {:db/ident :bioschema/expressedIn,
   :rdf/type :rdf/Property})

(def hasBioChemEntityPart
  {:db/ident         :bioschema/hasBioChemEntityPart,
   :rdf/type         :rdf/Property,
   :schema/inverseOf :bioschema/isPartOfBioChemEntity,
   :schema/subPropertyOf :schema/hasPart})

(def hasMolecularFunction
  {:db/ident :bioschema/hasMolecularFunction,
   :rdf/type :rdf/Property})

(def hasRepresentation
  {:db/ident :bioschema/hasRepresentation,
   :rdf/type :rdf/Property})

(def hasSequence
  {:db/ident :bioschema/hasSequence,
   :rdf/type :rdf/Property})

(def hasStatus
  {:db/ident :bioschema/hasStatus,
   :rdf/type :rdf/Property})

(def inChI
  {:db/ident :bioschema/inChI,
   :rdf/type :rdf/Property})

(def inChIKey
  {:db/ident :bioschema/inChIKey,
   :rdf/type :rdf/Property})

(def isControl
  {:db/ident :bioschema/isControl,
   :rdf/type :rdf/Property})

(def isEncodedByBioChemEntity
  {:db/ident         :bioschema/isEncodedByBioChemEntity,
   :rdf/type         :rdf/Property,
   :schema/inverseOf :bioschema/encodesBioChemEntity})

(def isInvolvedInBiologicalProcess
  {:db/ident :bioschema/isInvolvedInBiologicalProcess,
   :rdf/type :rdf/Property})

(def isLocatedInSubcellularLocation
  {:db/ident :bioschema/isLocatedInSubcellularLocation,
   :rdf/type :rdf/Property})

(def isPartOfBioChemEntity
  {:db/ident         :bioschema/isPartOfBioChemEntity,
   :rdf/type         :rdf/Property,
   :schema/inverseOf :bioschema/hasBioChemEntityPart,
   :schema/subPropertyOf :schema/isPartOf})

(def iupacName
  {:db/ident :bioschema/iupacName,
   :rdf/type :rdf/Property})

(def molecularFormula
  {:db/ident :bioschema/molecularFormula,
   :rdf/type :rdf/Property})

(def molecularWeight
  {:db/ident :bioschema/molecularWeight,
   :rdf/type :rdf/Property})

(def monoisotopicMolecularWeight
  {:db/ident :bioschema/monoisotopicMolecularWeight,
   :rdf/type :rdf/Property})

(def parentTaxon
  {:db/ident :bioschema/parentTaxon,
   :rdf/type :rdf/Property})

(def potentialUse
  {:db/ident :bioschema/potentialUse,
   :rdf/type :rdf/Property})

(def samplingAge
  {:db/ident :bioschema/samplingAge,
   :rdf/type :rdf/Property})

(def smiles
  {:db/ident :bioschema/smiles,
   :rdf/type :rdf/Property})

(def taxonRank
  {:db/ident :bioschema/taxonRank,
   :rdf/type :rdf/Property})

(def taxonomicRange
  {:db/ident :bioschema/taxonomicRange,
   :rdf/type :rdf/Property})
