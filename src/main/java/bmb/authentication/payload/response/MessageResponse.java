/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bmb.authentication.payload.response;

import lombok.Data;

/**
 *
 * @author bmares008
 */
@Data
public class MessageResponse {

    private String message;
    

    public MessageResponse(String message) {
        this.message = message;
    }
}
