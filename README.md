Web Service générique pour connecteur EasyId Leocarte - personnels, étudiants et invités.

La base de données doit être en Oracle et proposer une table (ou vue) nommée V_NORMANDIE_LEOCARTE et ayant cette structure : 

Nom                           NULL     Type
----------------------------- -------- -------------
TYPEPOPULATIONCODE                     VARCHAR2(2)
TYPEPOPULATIONCNOUS                    VARCHAR2(40)
ETABLISSEMENTCODE                      VARCHAR2(107)
TYPEVISUELCODE                         VARCHAR2(1)
TITRECARTELIBELLE                      VARCHAR2(60)
PREFIXELEOCODE                         VARCHAR2(5)
CODEBASEMETIER                         VARCHAR2(8)
PERSID                                 VARCHAR2(30)
BUNO                                   VARCHAR2(8)
LOGIN                         NOT NULL VARCHAR2(20)
EDUPERSONAFFILIATION                   VARCHAR2(100)
EPPN                          NOT NULL VARCHAR2(34)
INE                                    VARCHAR2(11)
NOMSURCARTE                            VARCHAR2(40)
PRENOM                                 VARCHAR2(255)
DATENAISSANCE                          DATE
EMAIL                                  VARCHAR2(120)
DATEFINDROITS                          DATE
ANNEEUNIVERSITAIRE            NOT NULL CHAR(4)
ETABLISSEMENTLIBELLE                   VARCHAR2(60)
ETABLISSEMENTRNE                       VARCHAR2(8)
EMPLOYEUR                              VARCHAR2(60)
AFFECTATION1CODE                       VARCHAR2(6)
AFFECTATIONRNE                         VARCHAR2(8)
AFFECTATION1LIBELLE                    VARCHAR2(60)
AFFECTATION2CODE                       VARCHAR2(6)
AFFECTATION2LIBELLE                    VARCHAR2(60)
CORPS                                  VARCHAR2(40)
RESPONSABILITESTRUCT                   VARCHAR2(60)
INDICEINM                              VARCHAR2(6)
DISCIPLINELIBELLE                      VARCHAR2(150)
DISCIPLINECODE                         VARCHAR2(150)
VERSIONVETCODE                         VARCHAR2(40)
ETAPELIBELLE                           VARCHAR2(25)
ETAPECODE                              VARCHAR2(6)
ETAPESECONDECODE                       VARCHAR2(6)
VERSIONVETSECONDECODE                  VARCHAR2(40)
ETAPESECONDELIBELLE                    VARCHAR2(25)
CGECODE                                VARCHAR2(3)
CGELIBELLE                             VARCHAR2(40)
CENTRESECUCODE                         VARCHAR2(3)
CENTRESECULIBELLE                      VARCHAR2(10)
COTISATIONPARTICULIERE                 VARCHAR2(60)
AUTORISATIONTRANSMISSIONCROUS          NUMBER(1)
AUTORISATIONDIFFUSIONPHOTO             NUMBER(1)
