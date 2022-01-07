for (int i = 0; i < N; i++) 
    {
		for (int j = 0; j < N; j++)
        if(board[i][j]==1)
			cout<<"Q"<<count++<<"    ";
        else
            cout<<"--"<<"    ";
		cout<<endl;
	}