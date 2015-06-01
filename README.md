Web Service générique pour connecteur EasyId Leocarte - personnels, étudiants et invités.

La base de données doit être en MySQL et proposer une table (ou vue) nommée V_NORMANDIE_LEOCARTE et ayant cette structure : 

+-------------------------------+--------------+------+-----+---------+-------+
| Field                         | Type         | Null | Key | Default | Extra |
+-------------------------------+--------------+------+-----+---------+-------+
| typePopulationCode            | varchar(2)   | YES  |     | NULL    |       |
| typePopulationCNOUS           | varchar(40)  | YES  |     | NULL    |       |
| etablissementCode             | varchar(107) | YES  |     | NULL    |       |
| typeVisuelCode                | varchar(1)   | YES  |     | NULL    |       |
| titreCarteLibelle             | varchar(60)  | YES  |     | NULL    |       |
| prefixeLeoCode                | varchar(5)   | YES  |     | NULL    |       |
| codeBaseMetier                | varchar(8)   | YES  |     | NULL    |       |
| persID                        | varchar(30)  | YES  |     | NULL    |       |
| buNo                          | varchar(8)   | YES  |     | NULL    |       |
| login                         | varchar(20)  | NO   |     |         |       |
| eduPersonAffiliation          | varchar(100) | YES  |     | NULL    |       |
| eppn                          | varchar(34)  | NO   |     |         |       |
| ine                           | varchar(11)  | YES  |     | NULL    |       |
| nomSurCarte                   | varchar(40)  | YES  |     | NULL    |       |
| prenom                        | varchar(255) | YES  |     | NULL    |       |
| dateNaissance                 | date         | YES  |     | NULL    |       |
| email                         | varchar(120) | YES  |     | NULL    |       |
| dateFinDroits                 | date         | YES  |     | NULL    |       |
| anneeUniversitaire            | char(4)      | NO   |     |         |       |
| etablissementLibelle          | varchar(60)  | YES  |     | NULL    |       |
| etablissementRNE              | varchar(8)   | YES  |     | NULL    |       |
| employeur                     | varchar(60)  | YES  |     | NULL    |       |
| affectation1Code              | varchar(6)   | YES  |     | NULL    |       |
| affectationRNE                | varchar(8)   | YES  |     | NULL    |       |
| affectation1Libelle           | varchar(60)  | YES  |     | NULL    |       |
| affectation2Code              | varchar(6)   | YES  |     | NULL    |       |
| affectation2Libelle           | varchar(60)  | YES  |     | NULL    |       |
| corps                         | varchar(40)  | YES  |     | NULL    |       |
| responsabiliteStruct          | varchar(60)  | YES  |     | NULL    |       |
| indiceInm                     | varchar(6)   | YES  |     | NULL    |       |
| disciplineLibelle             | varchar(150) | YES  |     | NULL    |       |
| disciplineCode                | varchar(150) | YES  |     | NULL    |       |
| versionVetCode                | varchar(40)  | YES  |     | NULL    |       |
| etapeLibelle                  | varchar(25)  | YES  |     | NULL    |       |
| etapeCode                     | varchar(6)   | YES  |     | NULL    |       |
| etapeSecondeCode              | varchar(6)   | YES  |     | NULL    |       |
| versionVETSecondeCode         | varchar(40)  | YES  |     | NULL    |       |
| etapeSecondeLibelle           | varchar(25)  | YES  |     | NULL    |       |
| cgeCode                       | varchar(3)   | YES  |     | NULL    |       |
| cgeLibelle                    | varchar(40)  | YES  |     | NULL    |       |
| centreSecuCode                | varchar(3)   | YES  |     | NULL    |       |
| centreSecuLibelle             | varchar(10)  | YES  |     | NULL    |       |
| cotisationParticuliere        | varchar(60)  | YES  |     | NULL    |       |
| autorisationtransmissionCrous | tinyint(1)   | YES  |     | NULL    |       |
| autorisationDiffusionPhoto    | tinyint(1)   | YES  |     | NULL    |       |
+-------------------------------+--------------+------+-----+---------+-------+

