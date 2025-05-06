If statements:

    If value1 = value2 Then
        MsgBox value1
    End if

    Select case value1
        Case 1
            MsgBox 1
        Case 2
            MsgBox 2
    End Select


Cycles:

    For i = 0 To 10
        MsgBox i
    Next i

    While i < 10
        MsgBox i
        i = i + 1
    Wend



Function declaration:

    Variables in a module:

        Public i as Integer



    Function Calculation(value As Integer)
        Calculation = value
    End Function



Variable declaration:

    Dim i as Integer
    Dim array(0 To 9) As Integer



New Line:

    Chr(13) & Chr(10)



Useful functions:
    
    Random number:
        
        Rnd(value)
        (topBoundary - bottomBoundary) * Rnd() + bottomBoundary --> random number from n to m

    Other:
        label.Caption --> get text from label
        object.Value --> get value from e.g. textbox
        .Visible
        .SetFocus
        InputBox()
        CStr(value)
        CInt(String)
        Format()
        FormatNumber()
        Sqr()


Database operations:

    DoCmd.OpenForm
    DoCmd.Close --> closes a form
    DoCmd.OpenQuery
    DoCmd.OpenTable
    DoCmd.Quit --> closes the databaze

    DoCmd.RunSQL()