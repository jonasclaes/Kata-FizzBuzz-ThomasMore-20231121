import XCTest

#if !canImport(ObjectiveC)
public func allTests() -> [XCTestCaseEntry] {
    return [
        testCase(kata_swift_startTests.allTests),
    ]
}
#endif
