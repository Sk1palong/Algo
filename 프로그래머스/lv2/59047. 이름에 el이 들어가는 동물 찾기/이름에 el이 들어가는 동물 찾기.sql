SELECT ANIMAL_ID, NAME FROM ANIMAL_INS
WHERE ANIMAL_TYPE='Dog' and (NAME LIKE('%EL') OR NAME LIKE('%EL%') OR NAME LIKE('EL%'))
ORDER BY NAME