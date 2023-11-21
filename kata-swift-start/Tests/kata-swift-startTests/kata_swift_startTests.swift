import XCTest
@testable import kata_swift_start

final class kata_swift_startTests: XCTestCase {
    func testExample() {
        // This is an example of a functional test case.
        // Use XCTAssert and related functions to verify your tests produce the correct
        // results.
        XCTAssertEqual(kata_swift_start().text, "Hello, World!")
    }
    
    func testFailingExample() {
        XCTAssertEqual(kata_swift_start().text, "Helo, World!")
    }

    static var allTests = [
        ("testExample", testExample),
    ]
}
