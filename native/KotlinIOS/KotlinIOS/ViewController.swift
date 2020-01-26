//
//  ViewController.swift
//  KotlinIOS
//
//  Created by benny brugman on 24/01/2020.
//  Copyright © 2020 Valori. All rights reserved.
//

import UIKit
import SharedCode

class ViewController: UIViewController {
    override func viewDidLoad() {
        super.viewDidLoad()
        
        let label = UILabel(frame: CGRect(x: 0, y: 0, width: 300, height: 21))
        label.center = CGPoint(x: 160, y: 285)
        label.textAlignment = .center
        label.font = label.font.withSize(25)
        label.text = CommonKt.createApplicationScreenMessage()
        view.addSubview(label)
        
        let subLabel = UILabel(frame: CGRect(x: 0, y: 0, width: 300, height: 21))
        subLabel.center = CGPoint(x: 200, y: 285)
        subLabel.textAlignment = .center
        subLabel.font = label.font.withSize(25)
        subLabel.text = CommonKt.testing(magic: 1)
        view.addSubview(label)
    }
}
