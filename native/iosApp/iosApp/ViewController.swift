//
//  ViewController.swift
//  iosApp
//
//  Created by benny brugman on 24/01/2020.
//  Copyright © 2020 Valori. All rights reserved.
//

import UIKit
import SharedCode

class ViewController: UIViewController {
    

    @IBOutlet weak var switchMessageLabel: UILabel!
    @IBOutlet weak var messageSwitch: UISwitch!
    
    @IBAction func messageSwitch(sender: UISwitch) {
        print(messageSwitch.isOn)
        CommonKt.isMessageToggled(messageToggled: messageSwitch.isOn, switchMessage: switchMessageLabel!)
//        switchMessageLabel.isHidden = !messageSwitch.isOn
    }
    
    override func viewDidLoad() {
        super.viewDidLoad()
        switchMessageLabel.text = CommonKt.createApplicationScreenMessage()
        switchMessageLabel.isHidden = true
        let label = UILabel(frame: CGRect(x: 0, y: 0, width: 300, height: 30))
        label.center = CGPoint(x: 160, y: 285)
        label.textAlignment = .center
        label.font = label.font.withSize(25)
        label.text = CommonKt.testing(magic: 1)
        view.addSubview(label)
        
        let subLabel = UILabel(frame: CGRect(x: 0, y: 0, width: 300, height: 30))
        subLabel.center = CGPoint(x: 160, y: 320)
        subLabel.textAlignment = .center
        subLabel.font = label.font.withSize(25)
        subLabel.text = CommonKt.commonTesting()
        view.addSubview(subLabel)
        

            
    }
    
}
        



