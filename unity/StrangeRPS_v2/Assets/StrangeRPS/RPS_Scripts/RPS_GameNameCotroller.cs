using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class RPS_GameNameCotroller : MonoBehaviour
{   
    //이름이 뜰 때까지 시작버튼 없었다가
    //이름이 제 위치에 오면 시작버튼 뜨기

    public GameObject TargetImg;
    public GameObject StartBtn;

    private Vector2 CurrPos;
    //private Vector3 TargetPos;
    private Vector3 TargetPos;

    private float speed = 130f;
    private bool arrivedFlag = false;
    
    // Start is called before the first frame update
    void Start()
    {
        TargetPos = new Vector3(189.0f, 476.7f, 0.0f);
    }

    public void MoveGameName()
    {
        CurrPos = this.gameObject.transform.position;
        float step = speed * Time.deltaTime;
        this.gameObject.transform.position = Vector2.MoveTowards(CurrPos, TargetPos, step);
    }

    //gameName이 target 위치에 오면 flag를 true로 바꿔줌
    //flag가 true가 되면 start btn을 띄움
    public void SetArreivedFlag()
    {
        if (this.gameObject.transform.position == TargetPos)
        {
            arrivedFlag = true;
        }
        
        if(arrivedFlag == true)
        {
            StartBtn.SetActive(true);
        }
    }

    public bool GetArrivedFlag()
    {
        return arrivedFlag;
    }

}
