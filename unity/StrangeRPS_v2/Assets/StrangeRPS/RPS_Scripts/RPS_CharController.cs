using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class RPS_CharController : MonoBehaviour
{
    public GameObject Char;

    void Start()
    {
        Char.transform.position = new Vector2(-1000f, 400f);
    }

    public void SetActiveChar()
    {
        Char.transform.position = new Vector2(0f, -2f);
    }
}
