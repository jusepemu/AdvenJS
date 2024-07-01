import Foundation

func cyberReindeer(road:String, time:Int) {
    let firstRoadList = road.map{ String($0) }
    var paths:[String] = [road]
    var position = 0
    
    for move in 1...time {
        // Add position
        position+=1
        
        // Save in currentRoad the last road
        var currentRoad = paths[move-1]
        
        // transforms the current road in Array ['s', '.', '.',....]
        var roadList = currentRoad.map{ String($0) } 
        
        // Remove position if have stopper
        if(roadList[position] == "|") {
            position-=1
        }
        
        // if move is the first so replace the firs position with ".", else, replac with the last element from the firstRoadList
        roadList[position-1] = move == 1 ? ".": firstRoadList[position-1]
        // Move element
        roadList[position] = "S"
        currentRoad = roadList.joined()
        
        // After five time movements open all barriers
        if(move >= 5) {
            currentRoad = currentRoad.replacingOccurrences(of: "|",with: "*")
        }
        
        paths.append(currentRoad)
        print("""
                Time: \(move)
                -----------------
                \(paths[move])
                
            """)
    }
}

cyberReindeer(road:"S..|...|..", time:10)