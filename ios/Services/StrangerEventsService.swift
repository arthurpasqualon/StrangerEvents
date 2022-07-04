//
//  StrangerEventsService.swift
//  StrangerEvents
//
//  Created by Arthur Pasqualon on 03/07/22.
//
import React

import Foundation
@objc(StrangerEventsService)
class StrangerEventsService: RCTEventEmitter {
    
  override func supportedEvents() -> [String]! {
    return ["strangeEvent"]
  }
  
  @objc(start)
  func start() {
    
    let randomNumber = Int.random(in: 1...16)
        
    switch randomNumber {
    case 1:
      emmitEvent(name: "Max",punctuation: 73, link: "https://mixed-arthurpasqualon.s3.us-east-1.amazonaws.com/Max.jpeg")
    case 2:
      emmitEvent(name: "Billy",punctuation: 150, link: "https://mixed-arthurpasqualon.s3.us-east-1.amazonaws.com/Billy.jpeg")
    case 3:
      emmitEvent(name: "Will",punctuation: 79, link: "https://mixed-arthurpasqualon.s3.us-east-1.amazonaws.com/Will.jpeg")
    case 4:
      emmitEvent(name: "Eleven",punctuation: 999, link: "https://mixed-arthurpasqualon.s3.us-east-1.amazonaws.com/Eleven.jpeg")
    case 5:
      emmitEvent(name: "Billy",punctuation: 230, link: "https://mixed-arthurpasqualon.s3.us-east-1.amazonaws.com/Billy.jpeg")
    case 6:
      emmitEvent(name: "Nancy",punctuation: 22, link: "https://mixed-arthurpasqualon.s3.us-east-1.amazonaws.com/Nancy.jpeg")
    case 7:
      emmitEvent(name: "Mike",punctuation: 45, link: "https://mixed-arthurpasqualon.s3.us-east-1.amazonaws.com/Mike.jpeg")
    case 8:
      emmitEvent(name: "Robin",punctuation: 7, link: "https://mixed-arthurpasqualon.s3.us-east-1.amazonaws.com/Robin.jpeg")
    case 9:
      emmitEvent(name: "Dustin",punctuation: 330, link: "https://mixed-arthurpasqualon.s3.us-east-1.amazonaws.com/Dustin.jpeg")
    case 10:
      emmitEvent(name: "Jim",punctuation: 50, link: "https://mixed-arthurpasqualon.s3.us-east-1.amazonaws.com/Jim.jpeg")
    case 11:
      emmitEvent(name: "Jonathan",punctuation: 200, link: "https://mixed-arthurpasqualon.s3.us-east-1.amazonaws.com/Jonathan.jpeg")
    case 12:
      emmitEvent(name: "Joyce",punctuation: 84, link: "https://mixed-arthurpasqualon.s3.us-east-1.amazonaws.com/Joyce.jpeg")
    case 13:
      emmitEvent(name: "Dr Brenner",punctuation: 77, link: "https://mixed-arthurpasqualon.s3.us-east-1.amazonaws.com/Dr Brenner.jpeg")
    case 14:
      emmitEvent(name: "Murray",punctuation: 230, link: "https://mixed-arthurpasqualon.s3.us-east-1.amazonaws.com/Murray.jpeg")
    case 15:
      emmitEvent(name: "Eddie",punctuation: 100, link: "https://mixed-arthurpasqualon.s3.us-east-1.amazonaws.com/Eddie.jpeg")
    case 16:
      emmitEvent(name: "Vecna",punctuation: 0, link: "https://mixed-arthurpasqualon.s3.us-east-1.amazonaws.com/Vecna.png")
    default:
      emmitEvent(name: "",punctuation: 0, link: "")
    }
    
    
    return
  }
  
  
  @objc func emmitEvent(name: String, punctuation: Int, link: String) {
    self.sendEvent(
      withName: "strangeEvent",
      body: [
        "name": name,
        "url": link,
        "punctuation": punctuation
      ])
  }
  
 }
