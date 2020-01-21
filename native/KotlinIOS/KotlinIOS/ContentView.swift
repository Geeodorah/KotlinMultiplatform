//
//  ContentView.swift
//  KotlinIOS
//
//  Created by benny brugman on 20/01/2020.
//  Copyright © 2020 Valori. All rights reserved.
//

import SwiftUI
import SharedCode

struct ContentView: View {
    var body: some View {
        Text(CommonKt.createApplicationScreenMessage())
    }
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
    }
}
