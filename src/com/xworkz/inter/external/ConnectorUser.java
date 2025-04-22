package com.xworkz.inter.external;

import com.xworkz.inter.internal.Connector;

public class ConnectorUser
{
    Connector connector;

public  ConnectorUser(Connector connector){
    this.connector=connector;

}
public  void  execute(){
    if(connector !=null){
        System.out.println("checking null");
        connector.run();
    }
}
}
