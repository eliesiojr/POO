#include "TOTVS.ch"
#include "TOPCONN.CH"

User Function IBCFGA01(cRotina, cDescricao, cSMG, cStatus, cJason)
    Local dData   := date()
    Local cHora   := time()
    If !Empty(cRotina) .AND. !Empty(cDescricao) .AND. !Empty(cSMG) .AND. !Empty(cStatus)
    // DBSelectArea(ZZY)
        If RecLock("ZZY",.T.)
        ZZY->ZZY_FILIAL := FWxFilial('ZZY')
        ZZY->ZZY_COD := cRotina
        ZZY->ZZY_ORIG := "Origem"
        // ZZY->ZZY_DESC := cDescricao
        ZZY->ZZY_LOG := cSMG
        ZZY->ZZY_DATA := dToC(dData)
        ZZY->ZZY_HORA := cHORA
        ZZY->ZZY_STATS := cStatus
        ZZY->ZZY_JSON := cJason

        EndIf
        Return .T.
    EndIf
    

Return .F.


User Function LOG()
    
    If U_IBCFGA01("cRotina", "cDescricao", "cSMG", "1", "cJason")
        MsgInfo("Log registrado")
    EndIf
    

Return
