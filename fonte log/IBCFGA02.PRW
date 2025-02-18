User Function IBCFGA02()
Local aArea       := GetArea()
Local cTabela     := "ZZY"
Private cCadastro := "Log_Integração"
Private aRotina := {}
aadd(aRotina, {"Add Log","U_LOG()",0,1})
aadd(aRotina, {"Reintegrar","U_LOG()",0,2})
aadd(aRotina,{"Visualizar","AXVISUAL",0,3})

// DbSelectArea(cTabela)
//     (cTabela)->(DbSetOrder(1))

mBrowse(,,,,cTabela)  


Return
