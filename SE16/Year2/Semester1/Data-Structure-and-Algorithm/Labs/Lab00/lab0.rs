// Theepakorn Phayonrat 67011352

// In case of using input
// use std::io;

fn main() {

    let mut beams: Vec<(i32, i32)> = Vec::new();
    // Given Data

    let n = 3;
    let data = [10, 90, 70, 100, 150, 210];
    // Answer should be [10, 100] [150, 210]
    // let n = 5;
    // let data = [10, 40, 20, 30, 50, 110, 100, 120, 130, 200];
    // Answer should be [10, 40] [50, 120] [130, 200]
    for i in 0..n {
        beams.push((data[2 * i], data[2 * i + 1]));
    }
    // let mut input = String::new();
    // println!("Please input n: ");
    // io::stdin().read_line(&mut input).expect("Failed to read");
    // let n: i32 = input.trim().parse().expect("Failed to parse");
    // input.clear();
    // for i in 0..n {
    //     println!("Please input a{i}: ");
    //     io::stdin().read_line(&mut input).expect("Failed to read");
    //     let a: i32 = input.trim().parse().expect("Failed to parse");
    //     input.clear();
    //     println!("Please input b{i}: ");
    //     io::stdin().read_line(&mut input).expect("Failed to read");
    //     let b: i32 = input.trim().parse().expect("Failed to parse");
    //     input.clear();
    //     beams.push((a, b));
    // }
    let result = merge_beams(beams);

    println!("{:?}", result);

}

fn merge_beams(beams: Vec<(i32, i32)>) -> Vec<(i32, i32)> {
    let mut result = Vec::new();
    let mut i = 0;
    while i < beams.len() {
        if i < beams.len() - 1 {
            if beams[i].1 >= beams[i+1].1 {
                result.push((beams[i].0, beams[i].1));
                i += 2;
                println!("{i}");
            } else if beams[i].1 >= beams[i+1].0 {
                result.push((beams[i].0, beams[i+1].1));
                i += 2;
                println!("{i}");
            } else {
                result.push((beams[i].0, beams[i].1));
                i += 1;
                println!("{i}");
            // }
            }
        } else if i == beams.len() - 1 {
            result.push((beams[i].0, beams[i].1));
            i += 1;
            println!("{i}");
        }
    }

    result
}
