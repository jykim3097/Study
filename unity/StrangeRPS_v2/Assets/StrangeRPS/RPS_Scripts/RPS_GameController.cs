using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class RPS_GameController : MonoBehaviour
{
    private bool arrivedFlag;
    
    void Start()
    {
        
    }
    
    void Update()
    {
        //game name이 내려오는 opening 코드
        if(arrivedFlag == false)
        {
            opening();
        }

    }

    void opening()
    {
        arrivedFlag = GameObject.Find("GameName").GetComponent<RPS_GameNameCotroller>().GetArrivedFlag();

        //게임 이름 내려오는 동작
        GameObject.Find("GameName").GetComponent<RPS_GameNameCotroller>().MoveGameName();

        //arrivedFlag가 true가 되면 버튼 만들기
        GameObject.Find("GameName").GetComponent<RPS_GameNameCotroller>().SetArreivedFlag();
    }
}
