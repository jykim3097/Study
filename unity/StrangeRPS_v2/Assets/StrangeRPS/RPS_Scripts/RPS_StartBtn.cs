using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class RPS_StartBtn : MonoBehaviour
{
    public GameObject GameName;
    public GameObject StartBtn;
    
    void Start()
    {
        this.gameObject.SetActive(false);
    }

    public void OnClickStartBtn()
    {
        //버튼 누르면 화면에서 안보이게 옮김
        StartBtn.transform.position = new Vector2(-1000f, 400f);
        GameName.transform.position = new Vector2(-1000f, 400f);
        GameObject.Find("boy").GetComponent<RPS_CharController>().SetActiveChar();
    }

}
